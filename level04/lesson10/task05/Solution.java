package com.javarush.test.level04.lesson10.task05;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i = 0;
        while (i < 10)
        {
            switch (i)
            {
                case (0):
                    System.out.println("1 2 3 4 5 6 7 8 9 10");
                    break;
                case (1):
                    System.out.println("2 4 6 8 10 12 15 16 18 20");
                    break;
                case (2):
                    System.out.println("3 6 9 12 15 18 21 24 27 30");
                    break;
                case (3):
                    System.out.println("4 8 12 16 20 24 28 32 36 40");
                    break;
                case (4):
                    System.out.println("5 10 15 20 25 30 35 40 45 50");
                    break;
                case (5):
                    System.out.println("6 12 18 24 30 36 42 48 54 60");
                    break;
                case (6):
                    System.out.println("7 14 21 28 35 42 49 56 63 70");
                    break;
                case (7):
                    System.out.println("8 16 24 32 40 48 56 64 72 80");
                    break;
                case (8):
                    System.out.println("9 18 27 36 45 54 63 72 81 90");
                    break;
                case (9):
                    System.out.println("10 20 30 40 50 60 70 80 90 100");
                    break;
            }
            i++;
        }
    }
}
