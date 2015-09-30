package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    int wgh = 5;
    private String kote = null;
    public Cat(String name)
    {
        this.kote = name;
    }
    public Cat(String name, int weight, int age)
    {
        this.kote = name + ", " + weight + ", " + age;
    }
    public Cat(String name, int age)
    {
        this.kote = name + ", " + age + ", " + wgh;
    }
    public Cat(int weight, String color)
    {
        this.kote = weight + ", " + color;
    }
    public Cat(int weight, String color, String adresok)
    {
        this.kote = weight + ", "+ color+", "+adresok;
    }

}
