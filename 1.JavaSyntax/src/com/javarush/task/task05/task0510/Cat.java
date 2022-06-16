package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name,address,color;
    int age,weight;//напишите тут ваш код
    public void initialize(String name){
        this.name=name;
        this.address=null;
        this.color="неопределенный";
        this.age=5;
        this.weight=10;
    }
    public void initialize(String name,int weight,int age){
        this.name=name;
        this.weight=weight;
        this.age=age;
        this.address=null;
        this.color="неопределенный";
    }
    public void initialize(String name,int age){
        initialize(name,70,age);
        this.address=null;
        this.color="неопределенный";
    }
    public void initialize(int weight,String color){
        initialize("John Doe");
        this.address=null;
        this.age=-1;
        this.weight=weight;
        this.color=color;
    }
    public void initialize(int weight,String color,String address){
        this.name=null;
        this.address=address;
        this.color=color;
        this.age=5;
        this.weight=weight;
    }
}
