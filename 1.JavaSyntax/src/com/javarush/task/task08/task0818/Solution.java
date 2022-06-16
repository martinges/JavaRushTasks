package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
    Map<String,Integer> map = new HashMap<>();
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.put("4",4);
        map.put("5",5);
        map.put("6",600);
        map.put("7",700);
        map.put("8",800);
        map.put("9",900);
        map.put("10",1000);
    return map;//напишите тут ваш код
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Map<String,Integer> copy = new HashMap<>(map);
        for(Map.Entry<String,Integer> pair:copy.entrySet()){
            if(pair.getValue()<500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}