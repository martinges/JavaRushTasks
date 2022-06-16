package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.skip(1L);
//        String temp = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        System.out.println(name+" захватит мир через "+age+" лет. Му-ха-ха!");
    }
}
