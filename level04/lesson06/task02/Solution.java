package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String some4 = reader.readLine();

        int nSome = Integer.parseInt(some);
        int mSome = Integer.parseInt(some2);
        int aSome = Integer.parseInt(some3);
        int bSome = Integer.parseInt(some4);

        if (nSome > mSome && nSome > aSome && nSome > bSome)
            System.out.println(nSome);
        else if (mSome > nSome && mSome > aSome && mSome > bSome)
            System.out.println(mSome);
        else if (aSome > nSome && aSome > mSome && aSome > bSome)
            System.out.println(aSome);
        else System.out.println(bSome);



    }
}
