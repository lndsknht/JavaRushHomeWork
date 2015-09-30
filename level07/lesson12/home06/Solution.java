package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import com.javarush.test.level06.lesson08.task05.StringHelper;

public class Solution
{
    public static void main(String[] args)
    {
        Human ded1 = new Human("Vasya", true, 90, null, null);
        Human ded2 = new Human("Kolya", true, 85, null, null);
        Human babushka1 = new Human("Vera", false, 85, null, null);
        Human babushka2 = new Human("Frosya", false, 90, null, null);
        Human mama = new Human("Nadya", false, 60, ded1, babushka1);
        Human papa = new Human("Tolya", true, 62, ded2, babushka2);
        Human son1 = new Human("Tor", true, 40, papa, mama);
        Human son2 = new Human("Shultz", true, 38, papa, mama);
        Human doch = new Human("Sveta", false, 33, papa, mama);



        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(babushka1.toString());
        System.out.println(babushka2.toString());

        System.out.println(mama.toString());
        System.out.println(papa.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(doch.toString());





        //Написать тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        //Написать тут ваш код

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
