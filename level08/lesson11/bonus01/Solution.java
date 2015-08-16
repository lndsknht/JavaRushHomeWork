package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        HashMap<String, Integer> mesyac = new HashMap<String, Integer>();
        mesyac.put("January", 1);
        mesyac.put("February",2);
        mesyac.put("March",3);
        mesyac.put("April",4);
        mesyac.put("May",5);
        mesyac.put("June",6);
        mesyac.put("July",7);
        mesyac.put("August",8);
        mesyac.put("September",9);
        mesyac.put("October",10);
        mesyac.put("November",11);
        mesyac.put("December",12);

        for (String m : mesyac.keySet())
        {
            if (s.equals(m))
            {
                System.out.println(m + " is " + mesyac.get(m) + " month");
            }
        }

/*
        Iterator<Map.Entry<String, Integer>> iterator = mesyac.entrySet().iterator();

        while (iterator.hasNext())
        {
            if (s.equals(iterator.next().getKey()))
            {
                System.out.println(iterator.next().getKey() + " is " + iterator.next().getValue() + " month.");
                break;
            }
        }*/

        //напишите тут ваш код
    }

}
