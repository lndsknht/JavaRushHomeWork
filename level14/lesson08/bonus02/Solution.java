package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int i1;
        int i2;

        do
        {
            //System.out.println("Enter 1st num");
            i1 = Integer.parseInt(reader.readLine());
            if (i1<0)
                i1 = Integer.parseInt(reader.readLine());
           // System.out.println("Enter 2nd num");
            i2 = Integer.parseInt(reader.readLine());
            if (i2<0)
                i2 = Integer.parseInt(reader.readLine());
            count++;
        } while(count==0);

        int mKoef =1;

        for(int i = 2; i<=i1&&i<=i2 ;)
        {
            int ost1 = i1%i;
            int ost2 = i2%i;
           // System.out.println("ost1 is "+ost1 + " ost2 is "+ost2);
            if (ost1==0&&ost2==0)
                {
                mKoef=i;
                i++;
                }
            else if (ost1>0&&ost2>0)
            {
                i++;
            }
            else if (ost1>0&&ost2==0)
            {
                i++;

            }
            else if (ost1==0&&ost2>0)
            {
                i++;
            }
            else if (ost1==i1&&ost2==i2)
            {
                mKoef=i-1;
                break;
            }
           /* else if (ost1>0||ost2>0)
            {
                mKoef=i-1;
                break;
            }*/
            if (mKoef==i1||mKoef==i2)
                break;
        }
        System.out.println(mKoef);
       // System.out.println("Biggest divisor is " + mKoef);

    }
}
