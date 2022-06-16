package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        try {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         while(true){
             int i = Integer.parseInt(reader.readLine());
             list.add(i);
             reader.skip(1L);
         }
     }catch (Exception e){
         for(Integer i:list){
             System.out.println(i);
         }
     }//напишите тут ваш код
    }
}
