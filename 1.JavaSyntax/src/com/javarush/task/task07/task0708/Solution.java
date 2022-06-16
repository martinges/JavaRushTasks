package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
    strings=new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int max=-1;
    for(int i=0;i<5;i++){
        strings.add(reader.readLine());
        if(i!=4) reader.skip(1L);
    }//напишите тут ваш код
        for(int i=0;i<5;i++){
            if(max<strings.get(i).length()){
                max=strings.get(i).length();
            }
        }
        for(int i=0;i<5;i++){
            if(max==strings.get(i).length()){
                System.out.println(strings.get(i));
            }
        }
    }
}
