package com.javarush.task.task04.task0411;

/* 
Время года
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        if(month<2||month==12){
            System.out.println("Зима");
        }else if(month>2&&month<6){
            System.out.println("Весна");
        }else if(month>5&&month<9){
            System.out.println("Лето");
        }else {
            System.out.println("Осень");
        }
    }
}