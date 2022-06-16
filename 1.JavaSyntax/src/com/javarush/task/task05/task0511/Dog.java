package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    //напишите тут ваш код
    String name,color;
    int height;
    public void initialize(String name){
        this.name=name;
        this.color=null;
        this.height=10;
    }
    public void initialize(String name,int height){
        this.name=name;
        this.color=null;
        this.height=height;
    }
    public void initialize(String name,int height,String color){
        this.name=name;
        this.color=color;
        this.height=height;
    }
    public static void main(String[] args) {

    }
}
