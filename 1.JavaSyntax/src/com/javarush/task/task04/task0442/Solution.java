package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number==-1){
                sum+=-1;
            break;
            }
            sum+=number;
            reader.skip(1L);
        }
        System.out.println(sum);
    }
}
