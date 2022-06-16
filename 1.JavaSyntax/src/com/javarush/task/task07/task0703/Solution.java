package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    String[] mas_str = new String[10];
    int[] mas_int = new int[10];
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
    for (int i=0;i<10;i++){
        mas_str[i]=reader.readLine();
        mas_int[i]=mas_str[i].length();
        if (i!=9) reader.skip(1L);
    }
    for(int i=0;i<10;i++){
        System.out.println(mas_int[i]);
    }
    }
}
