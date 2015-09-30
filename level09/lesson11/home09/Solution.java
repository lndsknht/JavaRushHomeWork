package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> mappa = new HashMap<String, Cat>();
        Cat cat1 = new Cat("Vasya");
        Cat cat2 = new Cat("Tosya");
        Cat cat3 = new Cat("Mosya");
        Cat cat4 = new Cat("Frosya");
        Cat cat5 = new Cat("Losya");
        Cat cat6 = new Cat("Kesha");
        Cat cat7 = new Cat("Gesha");
        Cat cat8 = new Cat("Sima");
        Cat cat9 = new Cat("Ukus");
        Cat cat10 = new Cat("Kusok");

        mappa.put("Vasya", cat1);
        mappa.put("Tosya", cat2);
        mappa.put("Mosya", cat3);
        mappa.put("Frosya", cat4);
        mappa.put("Losya", cat5);
        mappa.put("Kesha", cat6);
        mappa.put("Gesha", cat7);
        mappa.put("Sima", cat8);
        mappa.put("Ukus", cat9);
        mappa.put("Kusok", cat10);

        return mappa;
        //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> names = new HashSet<Cat>();
        Iterator<Map.Entry<String, Cat>> iterrator = map.entrySet().iterator();

        while (iterrator.hasNext())
        {
            names.add(iterrator.next().getValue());
        }

        return names;
        //напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {

            this.name = name;
        }

        public String toString()
        {

            return "Cat "+this.name;
        }
    }


}
