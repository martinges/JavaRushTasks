package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Хорошего много не бывает
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int num,i=0;
        while(true) {
            reader.skip(1L);
            num = Integer.parseInt(reader.readLine());
            if (num>0){
                break;
            }
        }
        while(i<num){
            System.out.println(str);
            i++;
        }
    }
}
