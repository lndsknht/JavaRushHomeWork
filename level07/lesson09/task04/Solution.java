package com.javarush.test.level07.lesson09.task04;

import java.util.ArrayList;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list.add("протазан"); //3
        list.add("фазан"); //4
        list.add("гизарма"); //5
        list.add("луза"); //6
        list.add("розмарин"); //7
        list.add("пончик"); //7
        list.add("синусоид"); //8

        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<String> listeg = new ArrayList<String>();

        for (int i =0; i < list.size(); i++)
        {
            if ((list.get(i).contains("р")) && (list.get(i).contains("л")) )
            {
                listeg.add(list.get(i));
            }
            else if (list.get(i).contains("л") && !list.get(i).contains("р"))
            {
                listeg.add(list.get(i));
                listeg.add(list.get(i));
            }
            else if (!list.get(i).contains("р") && !list.get(i).contains("л"))
            {
                listeg.add(list.get(i));
            }

        }

        //add your code here -  добавь код тут
        return listeg;
    }
}