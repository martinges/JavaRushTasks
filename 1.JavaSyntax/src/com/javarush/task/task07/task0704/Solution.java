package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        int[] mas = new int[10];
        for(int i=0;i<10;i++){
            mas[i] = Integer.parseInt(reader.readLine());
            if(i!=9) reader.skip(1L);
        }
        for(int i=9;i>=0;i--){
            System.out.println(mas[i]);
        }
    }
}

