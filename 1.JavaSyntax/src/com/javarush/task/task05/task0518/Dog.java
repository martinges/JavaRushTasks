package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек
*/


public class Dog {
    //напишите тут ваш код
    String name,color;
    int height;

    public Dog(String name, String color, int height) {
        this.name = name;
        this.color = color;
        this.height = height;
    }

    public Dog(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Dog(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

    }
}
