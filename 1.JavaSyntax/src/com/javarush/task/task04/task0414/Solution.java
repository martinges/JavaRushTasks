package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (num%400==0){
            System.out.println("Високосный");
        } else if (num%100==0) {
            System.out.println("Не високосный");
        } else if (num%4==0) {
            System.out.println("Високосный");
        }else {
            System.out.println("Не високосный");
        }
    }
}