package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
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
        int count1=0,count2=0;
        if(num1>0){
            count1++;
        }else if(num1<0){
            count2++;
        }
        if(num2>0){
            count1++;
        }else if(num2<0){
            count2++;
        }
        if(num3>0){
            count1++;
        }else if(num3<0){
            count2++;
        }
        System.out.println("количество отрицательных чисел: "+count2);
        System.out.println("количество положительных чисел: "+count1);
    }
}
