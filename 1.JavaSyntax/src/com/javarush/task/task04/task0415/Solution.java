package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        reader.skip(1L);
        int num2 = Integer.parseInt(reader.readLine());
        reader.skip(1L);
        int num3 = Integer.parseInt(reader.readLine());
        if((num1+num2>num3)&&(num1+num3>num2)&&(num2+num3>num1)){
            System.out.println("Треугольник существует");
        }else {
            System.out.println("Треугольник не существует");
        }
    }
}