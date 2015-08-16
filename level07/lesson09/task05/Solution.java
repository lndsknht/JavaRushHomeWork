package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++)
        {
            list.add(reader.readLine());
        }

        //read strings and init ArrayList list here - считать строки с консоли и объявить ArrayList list тут

        ArrayList<String> result = doubleValues(list);

        for (int j = 0; j < result.size(); j++)
        {
            System.out.println(result.get(j));
        }
        //print result - вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> temp = new ArrayList<String>();

        for (String x : list)
        {
            temp.add(x);
            temp.add(x);
        }

        // add your code here - добавь код тут
        return temp;
    }
}
