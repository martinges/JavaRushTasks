package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1= new Man("man1","1",18);
        Man man2= new Man("man2","2",28);
        Woman woman1= new Woman("woman1","3",16);
        Woman woman2= new Woman("woman2","4",26);
        //напишите тут ваш код
    }
public static class Man{
        String name,address;
        int age;

    public Man(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
        System.out.println(name+" "+age+" "+address);
    }
}
    public static class Woman{
        String name,address;
        int age;

        public Woman(String name, String address, int age) {
            this.name = name;
            this.address = address;
            this.age = age;
            System.out.println(name+" "+age+" "+address);
        }
    }

    //напишите тут ваш код
}
