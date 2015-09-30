package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int a = -1;
        boolean found = false;
        one: while (!found) {
            int num = Integer.parseInt(reader.readLine());
            if (num == a){
                sum+=a;
                System.out.println(sum);
                break one; }
            sum += num;

        }
    }
}
