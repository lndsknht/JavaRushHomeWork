package com.javarush.test.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций
(быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
*/

public class Solution
{
    public static List  getListForGet()
    {
        ArrayList<String> list = new ArrayList<String>();
        return list;
        //Напишите тут ваш код

    }

    public static List  getListForSet()
    {
        ArrayList<String> list = new ArrayList<String>();
        return list;
        //Напишите тут ваш код

    }

    public static List  getListForAddOrInsert()
    {
        LinkedList<String> list = new LinkedList<String>();
        return list;
        //Напишите тут ваш код

    }

    public static List  getListForRemove()
    {

        LinkedList<String> list = new LinkedList<String>();
        return list;
        //Напишите тут ваш код

    }

    public static void main(String[] args)
    {
       List lOne = getListForGet();
        List lTwo = getListForSet();
        List lThree = getListForAddOrInsert();
        List lFour = getListForRemove();
    }
}
