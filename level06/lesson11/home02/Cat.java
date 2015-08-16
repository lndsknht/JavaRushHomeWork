package com.javarush.test.level06.lesson11.home02;

/* Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

import java.util.ArrayList;

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<Cat>(10);
    String name;

    public Cat() {
        name = "Untitled";
        cats.add(this);
}

     //add your code here - добавь свой код тут

    public static void main(String[] args) {
        Cat cat1 = new Cat();
         Cat cat2 = new Cat();
         Cat cat3 = new Cat();
         Cat cat4 = new Cat();
         Cat cat5 = new Cat();
         Cat cat6 = new Cat();
         Cat cat7 = new Cat();
         Cat cat8 = new Cat();
         Cat cat9 = new Cat();
         Cat cat10 = new Cat();

         //Create 10 Cat-s here - создай 10 котов тут
        printCats();
    }

    public static void printCats() {
        String catname = "";
        for (int i = 0; i < cats.size(); i++) {
            catname = catname + cats.get(i) + " ";
        }
        System.out.println("Все коты: " + catname);
    //add your step 3 code here - добавь свой код для пункта 3 тут
    }
}
