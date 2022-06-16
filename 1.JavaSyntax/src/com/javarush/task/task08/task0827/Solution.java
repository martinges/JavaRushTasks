package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy",Locale.ENGLISH);
        int dis=dateFormat.parse("JANUARY 1 2022").getDay()-dateFormat.parse("JANUARY 1 2022").getDay()+1;
        boolean result=dis%2==1;
        return result;
    }
}
