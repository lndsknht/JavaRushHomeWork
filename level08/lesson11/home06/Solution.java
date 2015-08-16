package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human detka1 = new Human("Fedor", true, 26);
        Human detka2 = new Human("Tasya", false, 26);
        Human detka3 = new Human("Olya", false, 24);

        Human otec = new Human("Pasha", true, 45, detka1, detka2, detka3);
        Human mama = new Human("Katya", false, 40, detka1, detka2, detka3);


        Human dedO = new Human("Makar", true, 80, otec);
        Human dedM = new Human("Ivan", true, 83, mama);

        Human babkaO = new Human("Varya", false, 70, otec);
        Human babkaM = new Human("Nika", false, 75, mama);


        System.out.println(detka1);
        System.out.println(detka2);
        System.out.println(detka3);
        System.out.println(otec);
        System.out.println(mama);
        System.out.println(dedO);
        System.out.println(babkaO);
        System.out.println(dedM);
        System.out.println(babkaM);

        //напишите тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        Human (String name, boolean sex, int age, Human kid)
        {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.children.add(kid);
         }

        Human (String name, boolean sex, int age, Human kid, Human kid2, Human kid3)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(kid);
            this.children.add(kid2);
            this.children.add(kid3);
        }

        Human (String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }
        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
