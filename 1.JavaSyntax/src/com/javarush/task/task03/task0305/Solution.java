package com.javarush.task.task03.task0305;

/* 
Я так давно родился
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month;
        int day,year;
        while(true){
            System.out.println("Введите месяц:");
            month=reader.readLine();
            break;
        }
        while(true){
            System.out.println("Введите число:");
            day=Integer.parseInt(reader.readLine());
            if ((day>0)&&(day<32)){
            break;}
        }
        while(true){
            System.out.println("Введите год:");
            year=Integer.parseInt(reader.readLine());
            if (year>1900){
                break;}
        }
        System.out.println(month.toUpperCase()+" "+day+" "+year);
    }
}
