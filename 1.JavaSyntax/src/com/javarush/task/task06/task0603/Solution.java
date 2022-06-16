package com.javarush.task.task06.task0603;

/* 
По 50 000 объектов Cat и Dog
*/

public class Solution {
    public static void main(String[] args) {
        Cat[] cats = new Cat[500000];
        Dog[] dogs = new Dog[500000];
        for(int i=0;i<cats.length;i++){
            cats[i] = new Cat();
            dogs[i] = new Dog();
        }    // напишите тут ваш код
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
