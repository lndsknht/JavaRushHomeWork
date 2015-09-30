package com.javarush.test.level10.lesson11.home02;

/* Правильный ответ: d=5.5
Добавить одну операцию по преобразованию типа, чтобы получался ответ: d=5.5.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] test = new String[5];

        for(int i=0;i<5;i++)
        {
            test[i] = scanner.nextLine();
        }
        System.out.println("Before");
        for(String s: test)
        {
            System.out.println(s);
        }

        Arrays.sort(test);
        System.out.println("After");
        for(String s: test)
        {
            System.out.println(s);
        }


       /* int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + b/c/(double)e;
        System.out.println(d);*/
    }
}
