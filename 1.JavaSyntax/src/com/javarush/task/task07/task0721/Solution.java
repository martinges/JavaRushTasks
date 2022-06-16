package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;
int[] mas_main = getInts();
maximum=mas_main[0];
        minimum=mas_main[0];
        //напишите тут ваш код
for(Integer i:mas_main){
    if(maximum<i) maximum=i;
    if(minimum>i) minimum=i;
}
        System.out.print(maximum + " " + minimum);
    }
public static int[] getInts() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mas= new int[20];
        for(int i=0;i<20;i++){
            mas[i]=Integer.parseInt(reader.readLine());
            if(i!=19) reader.skip(1L);
        }
        return mas;
}
    //напишите тут ваш код
}
