package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;
        do
        {
            int k = Integer.parseInt(reader.readLine());
            i = k;
        } while (i<=0);

        int[] mas = new int[i];
        int maximum = Integer.parseInt(reader.readLine());
        mas[0] = maximum;
        for (int j = 1; j<i; j++ ) {
            mas[j] = Integer.parseInt(reader.readLine());
                if (mas[j] > maximum)
                {
                    maximum = mas[j];
                }
                    }
        System.out.println(maximum);

    }
}
