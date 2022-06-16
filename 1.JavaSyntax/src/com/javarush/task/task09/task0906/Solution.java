package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElement[stackTraceElement.length-1].getClassName()+": "+stackTraceElement[stackTraceElement.length-1].getMethodName()+": "+text);
        //напишите тут ваш код
    }
}
