package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
такого дня недели не существует
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String []mas={"понедельник","вторник","среда","четверг","пятница","суббота","воскресенье"};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (num<1||num>7){
            System.out.println("такого дня недели не существует");
        } else{
            System.out.println(mas[num-1]);
        }
    }
}