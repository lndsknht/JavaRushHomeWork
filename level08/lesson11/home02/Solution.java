package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        result.add(cat1);
        result.add(cat2);
        result.add(cat3);
        result.add(cat4);
        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs()
    {
        HashSet<Dog> sett = new HashSet<Dog>();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        sett.add(dog1);
        sett.add(dog2);
        sett.add(dog3);

        //напишите тут ваш код
        return sett;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        Set<Object> potsy = new HashSet<Object>();
        {
            potsy.addAll(cats);
            potsy.addAll(dogs);
        }


        //напишите тут ваш код
        return potsy;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        Set<Object> copy = new HashSet<Object>(pets);
        {
        }

        for (Object b: copy)
        {
        }
        //напишите тут ваш код
    }

    public static void printPets(Set<Object> pets)
    {
        for (Object s: pets)
        {
            System.out.println(s);
        }
        //напишите тут ваш код
    }

    public static class Cat
    {

    }

    public static class Dog
    {

    }


    //напишите тут ваш код
}
