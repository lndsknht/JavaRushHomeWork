package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        int age;
        boolean sex;
        int weight;
        int height;
        String nationality;

        Human(String n, int a, boolean s, int w, int h, String nat)
        {
            name =n;
            age = a;
            sex =s;
            weight =w;
            height =h;
            nationality=nat;
        }

        Human(String n)
        {
            name = n;
        }
        Human(String n,int a)
        {
            name =n;
            age =a;
        }
        Human (String n, boolean s)
        {
            name =n;
            sex =s;
        }
        Human (String n,String nat)
        {
            name=n;
            nationality=nat;
        }
        Human (String n,int a,int w,int h)
        {
            name = n;
            age =a;
            weight=w;
            height=h;
        }
        Human (String n, int a, boolean s)
        {
            name =n;
            age=a;
            sex=s;
        }
        Human (int a, boolean s)
        {
            age=a;
            sex=s;
        }
        Human (int a, String nat)
        {
            age=a;
            nationality=nat;
        }
        Human(int a,int w, int h)
        {
            age=a;
            weight=w;
            height=h;
        }
        //напишите тут ваши переменные и конструкторы
    }
}
