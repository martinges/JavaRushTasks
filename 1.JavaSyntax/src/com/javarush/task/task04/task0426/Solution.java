package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if(a==0){
            System.out.println("ноль");
        }else if(a<0&&Math.abs(a)%2==0){
            System.out.println("отрицательное четное число");
        } else if (a<0&&Math.abs(a)%2==1) {
            System.out.println("отрицательное нечетное число");
        } else if (a>0&&a%2==0) {
            System.out.println("положительное четное число");
        } else if (a>0&&a%2==1) {
            System.out.println("положительное нечетное число");
        }
    }
}
