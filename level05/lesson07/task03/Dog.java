package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String daggy = null;
    public void initialize(String name)
    {
        this.daggy = name;
    }
    public  void initialize(String name, int height)
    {
        this.daggy = name + ", " + height;
    }
    public void initialize(String name, int height, String color)
    {
        this.daggy = name + ", " + height + ", " + color;
    }


}
