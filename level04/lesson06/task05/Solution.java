package com.javarush.test.level04.lesson06.task05;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int cenz = 18;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String some = reader.readLine();
        String some2 = reader.readLine();

        int mSome = Integer.parseInt(some2);

        if (mSome < cenz)
            System.out.println("Подрасти еще");

    }
}
