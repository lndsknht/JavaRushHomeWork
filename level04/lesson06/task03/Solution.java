package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



            String some = reader.readLine();
            String some2 = reader.readLine();
            String some3 = reader.readLine();

            int nSome = Integer.parseInt(some);
            int mSome = Integer.parseInt(some2);
            int aSome = Integer.parseInt(some3);

            if (nSome > mSome && nSome > aSome)
            {
                System.out.println(nSome);
                if (mSome > aSome)
                {
                    System.out.println(mSome);
                    System.out.println(aSome);
                } else
                {
                    System.out.println(aSome);
                    System.out.println(mSome);
                }
            } else if (mSome > nSome && mSome > aSome)
            {
                System.out.println(mSome);
                if (nSome > aSome)
                {
                    System.out.println(nSome);
                    System.out.println(aSome);
                } else
                {
                    System.out.println(aSome);
                    System.out.println(nSome);
                }

            } else if (aSome > nSome && aSome > mSome)
            {
                System.out.println(aSome);
                if (nSome > mSome)
                {
                    System.out.println(nSome);
                    System.out.println(mSome);
                } else
                {
                    System.out.println(mSome);
                    System.out.println(nSome);
                }
            }



    }
}