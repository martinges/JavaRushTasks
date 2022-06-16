package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(reader.readLine());
    if (num>0){
        num=num*2;
    } else if (num<0) {
        num++;
    }
        System.out.println(num);
    }

}