package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();//напишите тут ваш код
        person.initialize("test",10);
        System.out.println(person.name+" "+person.age);
    }

    static class Person {
        String name;
        int age;//напишите тут ваш код
        public void initialize(String name,int age){
            this.name=name;
            this.age=age;
        }
    }
}
