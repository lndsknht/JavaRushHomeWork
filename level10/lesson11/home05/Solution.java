package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

       // System.out.println(alphabet.size());
        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        //мой код
        int[] count = new int[32];

        for (int i=0;i<list.size();i++)
        {
            char[] newWord = list.get(i).toCharArray();
            for(int k=0;k<newWord.length;k++)
            {
                int index = alphabet.indexOf(newWord[k]);
                count[index]++;
            }
        }

        for (int iz=0;iz<count.length;iz++)
        {
            System.out.println(alphabet.get(iz) + " " + count[iz]);
        }

       /* int a=0,b=0,v=0,g=0,d=0,e=0,yo=0,je=0,ze=0,ii=0,yi=0,ka=0,el=0,em=0,en=0,o=0,pe=0,re=0,se=0,te=0,u=0,f=0,h=0,ts=0,ch=0,sh=0,sch=0,tvz=0,iu=0,mgz=0,ee=0,yu=0,ya=0;

        char[] temp;
        String sTemp;

        for(int i = 0; i<list.size(); i++)
        {
            sTemp = list.get(i);
            sTemp=sTemp.replace(" ","");
            temp = sTemp.toCharArray();
            for (int k =0; k<temp.length;k++)
            {
                switch (temp[k]){
                    case 'а': a++; break;
                    case 'б': b++; break;
                    case 'в': v++; break;
                    case 'г': g++; break;
                    case 'д': d++; break;
                    case 'е': e++; break;
                    case 'ё': yo++; break;
                    case 'ж': je++; break;
                    case 'з': ze++;break;
                    case 'и': ii++;break;
                    case 'й': yi++;break;
                    case 'к': ka++;break;
                    case 'л': el++;break;
                    case 'м': em++;break;
                    case 'н': en++;break;
                    case 'о': o++;break;
                    case 'п': pe++;break;
                    case 'р': re++;break;
                    case 'с': se++;break;
                    case 'т': te++;break;
                    case 'у': u++;break;
                    case 'ф': f++;break;
                    case 'х': h++;break;
                    case 'ц': ts++;break;
                    case 'ч': ch++;break;
                    case 'ш': sh++;break;
                    case 'щ': sch++;break;
                    case 'ъ': tvz++;break;
                    case 'ы': iu++;break;
                    case 'ь': mgz++;break;
                    case 'э': ee++;break;
                    case 'ю': yu++;break;
                    case 'я': ya++;break;
                }

            }
        }

        System.out.println("а " + a);
        System.out.println("б " + b);
        System.out.println("в "+v);
        System.out.println("г "+g);
        System.out.println("д "+d);
        System.out.println("е "+e);
        System.out.println("ё "+yo);
        System.out.println("ж "+je);
        System.out.println("з "+ze);
        System.out.println("и "+ii);
        System.out.println("й "+yi);
        System.out.println("к "+ka);
        System.out.println("л "+el);
        System.out.println("м "+em);
        System.out.println("н "+en);
        System.out.println("о "+o);
        System.out.println("п "+pe);
        System.out.println("р "+re);
        System.out.println("с "+se);
        System.out.println("т "+te);
        System.out.println("у "+u);
        System.out.println("ф "+f);
        System.out.println("х "+h);
        System.out.println("ц "+ts);
        System.out.println("ч "+ch);
        System.out.println("ш "+sh);
        System.out.println("щ "+sch);
        System.out.println("ъ "+tvz);
        System.out.println("ы "+iu);
        System.out.println("ь "+mgz);
        System.out.println("э "+ee);
        System.out.println("ю "+yu);
        System.out.println("я "+ya);*/

/*
        String[] abvgd = new String[list.size()];

        for (int i =0; i<list.size(); i++)
        {
            abvgd[i]= list.get(i).toCharArray();
            abvgd[i]=abvgd[i].replace(" ","");
        }*/



        //напишите тут ваш код
    }

}
