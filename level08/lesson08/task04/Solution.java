package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Шварц", new Date("JULY 12 1990"));
        map.put("Pots", new Date("AUGUST 1 1984"));
        map.put("Nigra", new Date("SEPTEMBER 1 1985"));
        map.put("Cocker", new Date("MARCH 1 1986"));
        map.put("Cumdumster", new Date("APRIL 1 1988"));
        map.put("Dickhead", new Date("JUNE 1 1982"));
        map.put("Lepricone", new Date("OCTOBER 1 1983"));
        map.put("Stalker", new Date("AUGUST 1 1981"));
        map.put("Pitter", new Date("JUNE 1 1989"));

        //Напишите тут ваш код

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        /*Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        Date bifo = new Date("SEPTEMBER");
        Date aft = new Date("MAY");
        while (iterator.hasNext())
        {
            Date okk = iterator.next().getValue();
            *//*int mesyac = okk.getMonth();*//*

            if (okk.before(bifo)&&okk.after(aft))
                map.remove(iterator.next());

        }*/


        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Date ojy = iterator.next().getValue();
            int p = ojy.getMonth();
            if (p < 8 && p > 4)
                iterator.remove();





          /*  String look = pair.getValue().toString();
            if (look.contains("Jun"))

            {
                map.remove(pair.getKey());
            }
            else if (look.contains("Jul"))
            {
                map.remove(pair.getKey());
            }
            else if (look.contains("Aug"))
            {
                map.remove(pair.getKey());
            }*/
        }


        //Напишите тут ваш код

    }


}