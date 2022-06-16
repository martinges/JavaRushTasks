package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add("greregerg");//напишите тут ваш код
        list.add("greregerg");
        list.add("greregerg");
        list.add("greregerg");
        list.add("greregerg");
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
