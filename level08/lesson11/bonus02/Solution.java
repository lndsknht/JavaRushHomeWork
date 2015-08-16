package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

 /*       HashMap<String, String> mappa = new HashMap<String, String>();

        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        String s4 = reader.readLine();
        String s5 = reader.readLine();
        String s6 = reader.readLine();
        System.out.println();

        mappa.put(s1,s2);
        mappa.put(s3,s4);
        mappa.put(s5,s6);


        String rez = reader.readLine();
        System.out.println();
        System.out.println(mappa.get(rez));*/
/*
        for (String s : mappa.keySet())
        {
            if (s.equals(rez))
                System.out.println(mappa.get(rez));
        }*/

        //list of addresses
/*        List<String> addresses = new ArrayList<String>();
        for (int j =0; j<3; j++)
        {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }

        //read home number
        List<String> home = new ArrayList<String>();

        for (int k=0; k<3; k++)
        {
            String gorod = reader.readLine();
            if (gorod.isEmpty()) break;

            home.add(gorod);
        }*/

        ArrayList<String> adresa = new ArrayList<String>();
        ArrayList<String> imena = new ArrayList<String>();

        while (true)
        {
            String a1 = reader.readLine();
            if (a1.isEmpty())
                break;
            String i1 = reader.readLine();
            if (i1.isEmpty())
                break;
            adresa.add(a1);
            imena.add(i1);
        }

        String iskomoe = reader.readLine();

        for (String s : adresa)
            if (s.equals(iskomoe))
            {
                int p = adresa.indexOf(iskomoe);
                System.out.println(imena.get(p));
            }
    }
}
