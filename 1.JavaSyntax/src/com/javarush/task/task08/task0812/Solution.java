package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
    BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
    List<Integer> mas = new ArrayList<Integer>();
    for(int i=0;i<10;i++){
        mas.add(Integer.parseInt(reader.readLine()));
        if(i!=9) reader.skip(1L);
    }
    int max=1,temp=mas.get(0),count=1;
    for(int i=1;i<10;i++){
        if(mas.get(i)==temp) count++;
        else if (count>max) {
            max=count;
            count=1;
            temp=mas.get(i);
        }
    }
        System.out.println(max);
    }
}
