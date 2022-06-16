package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("мама");
        list.add("мыла");
        list.add("раму");

        if(list.indexOf("мама")<list.size()-1)
            list.add(list.indexOf("мама")+1,"именно");
        else
            list.add("именно");
        if(list.indexOf("мыла")<list.size()-1)
            list.add(list.indexOf("мыла")+1,"именно");
        else
            list.add("именно");
        if(list.indexOf("раму")<list.size()-1)
            list.add(list.indexOf("раму")+1,"именно");
        else
            list.add("именно");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
