package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String fry = null;
    public Friend(String name) {
        this.fry = name;
    }
    public Friend(String name, int age)
    {
        this.fry = name + ", " + age;
    }
    public Friend(String name, int age, String sex)
    {
        this.fry = name + ", " + age + ", " + sex;
    }

}