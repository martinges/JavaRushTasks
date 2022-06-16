package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double num = Double.parseDouble(reader.readLine());
        if(Math.round(Math.floor(num))%5==3){
            System.out.println("Жёлтый");
        } else if (Math.round(Math.floor(num))%5==4) {
            System.out.println("Красный");
        }else {
            System.out.println("Зелёный");
        }
    }
}