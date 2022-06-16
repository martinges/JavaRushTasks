package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));    //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int index=0,index1=0;
        for(int i=0;i<10;i++){
            list.add(reader.readLine());
            if(i!=9) reader.skip(1L);
        }
        for(int i=0;i<10;i++){
            if(max<list.get(i).length()){
                max=list.get(i).length();
                index=i;
            }
            if(min>list.get(i).length()){
                min=list.get(i).length();
                index1=i;
            }
        }
       int index2=index<index1 ? index : index1;
        System.out.println(list.get(index2));
    }
}
