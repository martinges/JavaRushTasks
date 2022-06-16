package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    ArrayList<String> list = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        for(int i=0;i<10;i++){
            list.add(0,reader.readLine());
            if(i!=9) reader.skip(1L);
        }
        for(int i=0;i<10;i++){
            System.out.println(list.get(i));
        }
    }
}
