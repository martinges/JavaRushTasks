package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
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
        int count=0;
        if(num1>0){
            count++;
        }
        if(num2>0){
            count++;
        }
        if(num3>0){
            count++;
        }
        System.out.println(count);
    }
}
