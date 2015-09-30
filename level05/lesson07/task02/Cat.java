package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен,
то нужно указать какой-нибудь средний вес. Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String kote = null;
    int wgt = 5;
    public void initialize(String name) {
        this.kote = name;
    }
    public void initialize(String name, int weight, int age) {
        this.kote = name + ", " + weight + ", " + age;
    }
    public void initialize(String name, int age){
        this.kote = name + ", " + age + ", " + wgt;
    }
    public void initialize(int weight, String color ){
        this.kote = weight + ", " + color;
    }
    public void initialize(int weight, String color, String adresok) {
        this.kote = weight + ", " + color + ", " + adresok;
    }

}
