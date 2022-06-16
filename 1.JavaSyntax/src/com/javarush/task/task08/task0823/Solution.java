package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String str= "";
        boolean pro=true;
        for(int i=0;i<string.length();i++){
            if(pro&&string.toCharArray()[i]!=' ') {
                str=str+string.substring(i, i + 1).toUpperCase();
                pro=false;
            }else if(string.substring(i,i+1).equals(" ")) {
                str+=" ";
                pro=true;
            }else str+=string.substring(i,i+1);
        }
        System.out.println(str);
        //напишите тут ваш код
    }
}
