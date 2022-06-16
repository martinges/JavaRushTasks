package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        even=0;
        odd=0;
        int num = Integer.parseInt(reader.readLine());//напишите тут ваш код
        while(num!=0){
            if((num%10)%2==0){
                even++;
            }else{
                odd++;
            }
            num/=10;
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }
}
