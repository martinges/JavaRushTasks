package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static void divideByZero() throws ArithmeticException{
        int x = 5 / 0;
        System.out.println(x);
    }
}
