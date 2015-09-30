package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//Напишите тут ваш код
        String s1 = reader.readLine();
        return s1;
    }

    public static int readInt() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //Напишите тут ваш код
        int i1 = Integer.parseInt(reader.readLine());
        return i1;
    }

    public static double readDouble() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//Напишите тут ваш код
        double d1 = Double.parseDouble(reader.readLine());
        return d1;
    }

    public static void readLn() throws Exception
    {
       readString();

         }
         //Напишите тут ваш код
    }

