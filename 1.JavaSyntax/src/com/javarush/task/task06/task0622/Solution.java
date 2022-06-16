package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mas = new int[5];
        for(int i=0;i<5;i++){
            mas[i]=Integer.parseInt(reader.readLine());
            if(i!=4) reader.skip(1L);
        }
        for(int i=0;i<4;i++){
            for(int j=i+1;j<5;j++){
                if(mas[j]<mas[i]){
                    int temp=mas[j];
                    mas[j]=mas[i];
                    mas[i]=temp;
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.println(mas[i]);
        }
        //напишите тут ваш код
    }
}
