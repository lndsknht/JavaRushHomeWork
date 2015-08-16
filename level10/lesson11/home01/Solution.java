package com.javarush.test.level10.lesson11.home01;

/* Правильный ответ: d=2.941
Добавить одну операцию по преобразованию типа, чтобы получался ответ: d=2.941.
*/

public class Solution
{
    public static void main(String[] args)
    {
        int a = 50;
        int b = 17;
        float f = (a/(b*1.0f));
        double d = ((a*1.0d) / b);
        System.out.println(d);
        System.out.println(f);
    }
}
