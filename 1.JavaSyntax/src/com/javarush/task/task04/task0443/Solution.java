package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name= reader.readLine();
        reader.skip(1L);
        int y = Integer.parseInt(reader.readLine());
        reader.skip(1L);
        int m = Integer.parseInt(reader.readLine());
        reader.skip(1L);
        int d = Integer.parseInt(reader.readLine());
        System.out.println("Меня зовут "+name+".");
        System.out.println("Я родился "+d+"."+m+"."+y);
    }
}
