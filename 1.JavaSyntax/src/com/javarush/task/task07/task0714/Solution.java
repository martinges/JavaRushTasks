package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();//напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++){
            list.add(reader.readLine());
            if(i!=4) reader.skip(1L);
        }
        list.remove(2);
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
    }
}
