package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {

        int[] m1 = new int[]{1,2,3,4,5};
        int[] m2 = new int[]{6,7};
        int[] m3 = new int[]{8,9,10,11};
        int[] m4 = new int[]{12,13,14,15,16,17,18};
        int[] m5 = new int[0];

        ArrayList<int[]> obsh = new ArrayList<int[]>();
        Collections.addAll(obsh, m1,m2,m3,m4,m5);
        return obsh;
        //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
