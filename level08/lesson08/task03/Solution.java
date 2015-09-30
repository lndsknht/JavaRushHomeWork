package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Хиди", "Лена");
        map.put("Костер", "Николай");
        map.put("Александров", "Владимир");
        map.put("Поплавский", "Владимир");
        map.put("Костюк", "Николай");
        map.put("Вайсброт", "Евгений");
        map.put("Корецкий", "Данил");
        map.put("Костюк", "Константин");
        map.put("Земан", "Михаил");
        map.put("Зорге", "Рихард");
        //Напишите тут ваш код
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //Напишите тут ваш код
        return 0;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //Напишите тут ваш код
        return 0;
    }
}
