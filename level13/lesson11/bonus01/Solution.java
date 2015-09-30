package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;



public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();

        File file = new File(reader.readLine());

        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;

                while ((s = in.readLine()) != null) {
                    int chet = Integer.parseInt(s);

                    if(chet%2==0)
                    {
                        list.add(chet);
                    }

                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        int mass[] = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            mass[i]=list.get(i);
        }

        Arrays.sort(mass);

        for(int anArray: mass) System.out.println(anArray);

    }
}
