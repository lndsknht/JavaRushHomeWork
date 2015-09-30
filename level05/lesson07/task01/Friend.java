package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String itog = null;
    public void initialize(String name)
    {
        this.itog = name;
    }
    public void initialize(String name, int age)
    {
        this.itog = name +", "+ age;
    }
    public void initialize(String name, int age, String sex)
    {
        this.itog = name + ", " + age + ", " + sex;
    }

}
