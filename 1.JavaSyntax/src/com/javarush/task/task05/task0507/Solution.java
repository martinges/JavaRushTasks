package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));    //напишите тут ваш код
    double sum=0;
    int i=0;
    while(true){
        int num = Integer.parseInt(reader.readLine());
        if (num==-1){
            break;
        }
        sum+=num;
        i++;
        reader.skip(1L);
    }
    if (i==0){
        System.out.println("0");
    }else{
        System.out.println(sum/i);
    }
    }
}

