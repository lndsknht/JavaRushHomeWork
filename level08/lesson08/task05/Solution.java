package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> mapuska = createMap();
        removeTheFirstNameDuplicates(mapuska);
        System.out.println(mapuska);
    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> mappa = new HashMap<String, String>();

        mappa.put("Проскуров", "Саша");
        mappa.put("Никитин", "Вова");
        mappa.put("Перепёлкин", "Сергей");
        mappa.put("Николайчук", "Вася");
        mappa.put("Павленко", "Елена");
        mappa.put("Огрызко", "Саша");
        mappa.put("Вихлятко", "Вова");
        mappa.put("Ремизов", "Коля");
        mappa.put("Ерофеев", "Иван");
        mappa.put("Костюк", "Ярослав");
        //напишите тут ваш код
        return mappa;
    }

    public static HashMap<String, String> removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            String name = iterator.next().getValue();

            removeItemFromMapByValue(map, name);
        }

        return map;

        //напишите тут ваш код

    }

    public static HashMap<String, String> removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);

        Iterator<Map.Entry<String, String>> iterrr = copy.entrySet().iterator();

        while (iterrr.hasNext())
        {
            if (iterrr.next().getValue().equals(value))
            {
                iterrr.remove();
            }
        }
        return copy;

        /*HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }*/
    }
}
