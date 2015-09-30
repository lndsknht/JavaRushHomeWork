package com.javarush.test.level08.lesson08.task02;

import java.io.IOException;
import java.util.*;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashSet<Integer> pots = createSet();
        removeAllNumbersMoreThan10(pots);
    }
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set = new HashSet<Integer>();

        set.add(7);
        set.add(45);
        set.add(3);
        set.add(54);
        set.add(78);
        set.add(11);
        set.add(4);
        set.add(9);
        set.add(654);
        set.add(458);
        set.add(98);
        set.add(1);
        set.add(15);
        set.add(2);
        set.add(73);
        set.add(5);
        set.add(781);
        set.add(8);
        set.add(44);
        set.add(6);

        //Напишите тут ваш код
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {

       Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext())
        {
            int a = iterator.next();
            if (a>10)
            {
                iterator.remove();
            }
        }

        //Напишите тут ваш код
       return set;
    }
}
