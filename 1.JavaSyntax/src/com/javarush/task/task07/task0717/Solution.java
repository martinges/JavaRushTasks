package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();// Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<10;i++){
            list.add(reader.readLine());
            if(i!=9) reader.skip(1L);
        }
        ArrayList<String> result = doubleValues(list);
        for(String s:result) {
            System.out.println(s);
        }
        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> temp = new ArrayList<>();
        for(String s:list) {
            temp.add(s);
            temp.add(s);
        }
        //напишите тут ваш код
        return temp;
    }
}
