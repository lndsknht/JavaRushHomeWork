package com.javarush.test.level06.lesson11.bonus02;

import com.javarush.test.level05.lesson09.task02.Cat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dedaName = reader.readLine();
        Cat catDeda = new Cat(dedaName, null, null);

        String babaName = reader.readLine();
        Cat catBaba = new Cat(babaName, null, null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catDeda, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catBaba);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);


        System.out.println(catDeda);
        System.out.println(catBaba);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.print(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat mama;
        private Cat papa;

        Cat(String name)
        {

            this.name = name;
        }

        Cat(String name, Cat papa, Cat mama)
        {
            this.name = name;
            this.papa = papa;
            this.mama = mama;

        }

        @Override
        public String toString()
        {
            return "Cat name is " + name +","+
                    ((mama!=null ? " mother is " + mama.name : " no mother") +
                            (papa!=null ? ", father is " + papa.name : ", no father"));

        }

    }

}
