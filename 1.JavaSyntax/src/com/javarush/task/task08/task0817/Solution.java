package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Нам повторы не нужны
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
        map.put("7","6");
        map.put("8","8");
        map.put("9","9");
        map.put("10","10");
return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
            Set<String> names = new HashSet<>();
//дубликаты
        Set<String> duplicatedNames = new HashSet<>();
        for (String name : map.values()) {
            if (names.contains(name)) {
                duplicatedNames.add(name);
            }
            names.add(name);
        }
        Map<String,String> copy = new HashMap<>(map);
        for(Map.Entry<String,String> pair: copy.entrySet()){
            if(duplicatedNames.contains(pair.getValue())){
                map.remove(pair.getKey());
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
