package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name,address,color;
    int age,weight;

    public Cat(int weight,String color) {
        this.color = color;
        this.weight = weight;
        this.name=null;
        this.address=null;
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight=10;
    }

    public Cat(int weight,String color,String address) {
        this.address = address;
        this.color = color;
        this.weight = weight;
    }

    public static void main(String[] args) {

    }
}
