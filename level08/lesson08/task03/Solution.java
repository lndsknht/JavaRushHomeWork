package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> mapa = new HashMap<String, String>();

        mapa.put("Вакарчук","Николай");
        mapa.put("Ересько","Николай");
        mapa.put("Пулитц","Александр");
        mapa.put("Майборода","Владимир");
        mapa.put("Керченский","Александр");
        mapa.put("Волобуев","Арсен");
        mapa.put("Розенберг","Татьяна");
        mapa.put("Килько","Татьяна");
        mapa.put("Гречко","Елена");
        mapa.put("Шмыгало","Арсен");

        //Напишите тут ваш код
    return mapa;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            if (name.equals(iterator.next().getValue()))
                count++;
        }

        //Напишите тут ваш код
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            if (familiya.equals(iterator.next().getKey()))
                count++;
        }

        return count;
        //Напишите тут ваш код

    }


}
