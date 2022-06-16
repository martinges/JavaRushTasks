package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] mas = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<20;i++){
            mas[i]=Integer.parseInt(reader.readLine());
            if (i!=19) reader.skip(1L);
        }
        // создай и заполни массив
        return mas;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max=Integer.MIN_VALUE;
        for (int i=0;i<20;i++){
            if (max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
}
