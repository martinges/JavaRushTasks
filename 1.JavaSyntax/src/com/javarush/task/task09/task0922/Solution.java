package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);
        DateFormat dateFormat2 = new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);
        Date date = dateFormat.parse(reader.readLine());
        System.out.println(dateFormat2.format(date).toUpperCase());
    }
}
