package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] mas = new int[20];

        for (int i=0; i <20; i++)
        {
            int z = Integer.parseInt(reader.readLine());
            mas[i]=z;
        }

        int  maximum = mas[0];
        int  minimum = mas[0];

        for (int x: mas)
                if (x > maximum)
                {
                    maximum = x;
                }
        for (int y: mas)
                if ( y < minimum)
                {
                    minimum = y;
                }
        //Напишите тут ваш код


        System.out.print(maximum);
        System.out.print(" ");
        System.out.print(minimum);
    }
}
