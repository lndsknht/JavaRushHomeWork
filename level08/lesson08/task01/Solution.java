package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String > set = new HashSet<String>();

        set.add("лампа");
        set.add("ложе");
        set.add("ляжка");
        set.add("люмпен");
        set.add("ландскнехт");
        set.add("лизинг");
        set.add("лапсердак");
        set.add("ландлорд");
        set.add("левитация");
        set.add("лапоть");
        set.add("легкое");
        set.add("лебеда");
        set.add("луч");
        set.add("ласта");
        set.add("лоскут");
        set.add("ловчий");
        set.add("лепрекон");
        set.add("ламмас");
        set.add("лепра");
        set.add("любовь");

        return set;

        //Напишите тут ваш код
    }
}
