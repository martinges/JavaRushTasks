package com.javarush.task.task03.task0303;

/* 
Обмен валют
1,05
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(10,1.05));
        System.out.println(convertEurToUsd(100,1.05));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        //напишите тут ваш код
        return eur*exchangeRate;
    }
}
