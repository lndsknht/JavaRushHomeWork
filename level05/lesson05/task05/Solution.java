package com.javarush.test.level05.lesson05.task05;

  /* if(cat1.fight(cat2))
            System.out.println("Dbl");
        cat1.fight(cat3);

        cat2.fight(cat1);
        cat2.fight(cat3) ;

        cat3.fight(cat1);
        cat3.fight(cat2);

        if (cat1.count > cat2.count && cat1.count > cat3.count)
            System.out.println("Moysha is a Champion");
        else  if (cat2.count > cat1.count && cat2.count > cat3.count)
            System.out.println("Bulka is a Champion");
        else  if (cat3.count > cat2.count && cat3.count > cat1.count)
            System.out.println("Simona is a Champion"); */

/* Провести три боя  попарно между котами
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Moysha", 8, 6, 12);//add your code here
        Cat cat2 = new Cat("Bulka", 5, 4, 10);
        Cat cat3 = new Cat("Simona", 7, 5, 11);

        boolean wtf;

        wtf = cat1.fight(cat2);
        if (wtf)
            System.out.println("Moysha kicked Bulka");
        else System.out.println("Bulka kicked Moysha");
        wtf = cat1.fight(cat3);
        if (wtf)
            System.out.println("Moysha kicked Simona");
        else System.out.println("Simona kicked Moysha");

        wtf = cat2.fight(cat3);
        if (wtf)
            System.out.println("Bulka kicked Simona");

        else
            System.out.print("Simona kicked Bulka");

    }

    public static class Cat {

        public static int count = 0;
        public static int fightCount = 0;

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; //эквивалентно return score > 2 ? true : false;
        }
    }
}
