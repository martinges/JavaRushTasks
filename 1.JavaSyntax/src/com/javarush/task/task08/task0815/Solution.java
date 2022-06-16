package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
    Map<String,String> map = new HashMap<String,String>();
    map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");
        map.put("5","5");
        map.put("6","6");
        map.put("7","7");
        map.put("8","8");
        map.put("9","9");
        map.put("10","10");
    return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count=0;
        for(Map.Entry pair: map.entrySet()){
            if(pair.getValue().equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count=0;
        for(Map.Entry pair: map.entrySet()){
            if(pair.getKey().equals(lastName)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
