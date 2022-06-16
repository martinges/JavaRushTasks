package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       ArrayList<String> list = new ArrayList<>();//напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int res=-1;
        for(int i=0;i<10;i++){
            list.add(reader.readLine());
            if(i!=9) reader.skip(1L);
        }
        for(int i=0;i<9;i++){
            if(list.get(i).length()>list.get(i+1).length()){
                res=i+1;
                break;
            }
        }
        if (res!=-1){
            System.out.println(res);
        }
    }
}

