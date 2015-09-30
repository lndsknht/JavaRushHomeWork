/*
package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

*/
/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*//*


public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {

        HashMap<Integer,String> mappa = new HashMap<Integer, String>();
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<Integer>

        for(String s: array)
        {
            if(isNumber(s))

        }


        //напишите тут ваш код
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
*/

package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        // мой нерабочий код
       /* String[] words = new String[3];
        String[] nums = new String[3];

        String[] sorted = new String[array.length];

        HashMap<Integer,String> mappa = new HashMap<Integer, String>();

        for (int k =0; k<array.length;k++)
        {
            if(isNumber(array[k])) {
                mappa.put(k,"chislo");
                nums[k]=array[k];
            }
            else
            {
                mappa.put(k,"slovo");
                words[k]=array[k];
            }
        }

        Arrays.sort(words);

        for(int i=0;i<nums.length;i++)
        {
            for(int k=i+1; k<nums.length;k++)
                if (Integer.parseInt(nums[i])<Integer.parseInt(nums[k]))
                {
                    String tmp = nums[i];
                    nums[i]=nums[k];
                    nums[k]=tmp;
                }
        }

        Iterator<Map.Entry<Integer,String>> iterator = mappa.entrySet().iterator();

        while (iterator.hasNext())
        {
            String tmp = iterator.next().getValue();
            int pz = iterator.next().getKey();
            if (tmp.contains("slovo"))
                sorted[pz]=words[pz];
            else if (tmp.contains("chislo"))
                sorted[pz]=nums[pz];
        }

        // System.arraycopy(sorted,0,array,0,array.length);

         for (int j=0;j<array.length;j++)
                array[j]=sorted[j];

        for (String s:array)
            System.out.println(s);*/

        for (int i=0;i<array.length;i++)
        {
            for (int j=i+1;j<array.length;j++)
            {
                if (isNumber(array[i])&&isNumber(array[j]))
                {
                    if (Integer.parseInt(array[i])<Integer.parseInt(array[j]))
                    { String tmp = array[i];
                        array[i]=array[j];
                        array[j]=tmp; }

                }
                else if (!isNumber(array[i])&&!isNumber(array[j]))
                {
                    if (isGreaterThen(array[i].toLowerCase(),array[j].toLowerCase()))
                    {
                        String tm = array[i];
                        array[i]=array[j];
                        array[j]=tm;
                    }
                }
            }
        }


//напишите тут ваш код
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }

    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}

