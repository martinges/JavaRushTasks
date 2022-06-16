package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] mas = new int[15];//напишите тут ваш код
    int sum_chet=0,sum_nechet=0;
        for(int i =0; i<15;i++){
        mas[i]=Integer.parseInt(reader.readLine());
        if(i!=14) reader.skip(1L);
    }
    for(int i=0;i<15;i++){
        if(i%2==0) sum_chet+=mas[i];
        else sum_nechet+=mas[i];
    }
    if(sum_nechet>sum_chet)
        System.out.println("В домах с нечетными номерами проживает больше жителей.");
    else if(sum_chet>sum_nechet)
        System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}
