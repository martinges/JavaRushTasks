package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        map.put("1",new Cat("1"));
        map.put("2",new Cat("1"));
        map.put("3",new Cat("2"));
        map.put("4",new Cat("2"));
        map.put("5",new Cat("3"));
        map.put("6",new Cat("3"));
        map.put("7",new Cat("4"));
        map.put("8",new Cat("4"));
        map.put("9",new Cat("5"));
        map.put("10",new Cat("5"));
        return map;//напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
   /*     Set<Cat> set = new HashSet<>();
        for(Cat cat:map.values()){
            set.add(cat);
        }*/
        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
