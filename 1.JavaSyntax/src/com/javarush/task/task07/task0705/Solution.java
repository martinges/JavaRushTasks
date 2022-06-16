package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    int[] mas = new int[20];
    int[] mas1 = new int[10];//напишите тут ваш код
    int[] mas2 = new int[10];
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for(int i=0;i<20;i++){
        mas[i]=Integer.parseInt(reader.readLine());
        if(i!=19) reader.skip(1L);
    }
    for(int i=0;i<20;i++){
        if(i<10){
            mas1[i]=mas[i];
        }else{
            mas2[i-10]=mas[i];
        }
    }
    for(int i=0;i<10;i++){
        System.out.println(mas2[i]);
    }
    }
}
