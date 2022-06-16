package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        String name,race;
        int age,height,weight;
        boolean sex;// Напишите тут ваши переменные и конструкторы

        public Human(String name, String race, int age, int height, int weight, boolean sex) {
            this.name = name;
            this.race = race;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, String race, int age, int height, int weight) {
            this.name = name;
            this.race = race;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, String race, int age, int height) {
            this.name = name;
            this.race = race;
            this.age = age;
            this.height = height;
        }

        public Human(String name, String race, int age) {
            this.name = name;
            this.race = race;
            this.age = age;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }

        public Human(int weight) {
            this.weight = weight;
        }

        public Human(String name, String race, boolean sex) {
            this.name = name;
            this.race = race;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }
}
