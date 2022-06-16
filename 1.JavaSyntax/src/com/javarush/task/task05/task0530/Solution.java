package com.javarush.task.task05.task0530;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Шеф, что-то не пашет
Sum =
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        reader.skip(1L);
        int b = Integer.parseInt(reader.readLine());

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
