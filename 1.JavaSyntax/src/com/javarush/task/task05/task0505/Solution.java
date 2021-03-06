package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

import java.sql.SQLOutput;

public class Solution {

    public static void main(String[] args) {
    Cat cat1 = new Cat("cat1",1,2,3);    //напишите тут ваш код
        Cat cat2 = new Cat("cat2",2,3,4);
        Cat cat3 = new Cat("cat3",3,4,5);
        System.out.println("1 кот выиграл у 2 = "+cat1.fight(cat2));
        System.out.println("1 кот выиграл у 3 = "+cat1.fight(cat3));
        System.out.println("2 кот выиграл у 3 = "+cat2.fight(cat3));
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
