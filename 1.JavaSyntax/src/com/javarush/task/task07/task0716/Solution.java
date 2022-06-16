package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> mas = new ArrayList<>();
        for (String string : strings) {
            if(string.indexOf("р")>-1&&string.indexOf("л")>-1){
                mas.add(string);
            } else if (string.indexOf("р")==-1&&string.indexOf("л")>-1) {
                mas.add(string);
                mas.add(string);
            } else if (string.indexOf("р")==-1&&string.indexOf("л")==-1) {
                mas.add(string);
            }
        }
        //напишите тут ваш код
        return mas;
    }
}