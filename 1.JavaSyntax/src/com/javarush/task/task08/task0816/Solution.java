package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/*
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов2", dateFormat.parse("MAY 2 2012"));
        map.put("Смирнов3", dateFormat.parse("MAY 3 2012"));
        map.put("Смирнов4", dateFormat.parse("MAY 4 2012"));
        map.put("Смирнов5", dateFormat.parse("MAY 5 2012"));
        map.put("Смирнов6", dateFormat.parse("MAY 6 2012"));
        map.put("Смирнов7", dateFormat.parse("MAY 7 2012"));
        map.put("Смирнов8", dateFormat.parse("MAY 8 2012"));
        map.put("Смирнов9", dateFormat.parse("MAY 9 2012"));
        map.put("Смирнов10", dateFormat.parse("June 10 2012"));
return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
for(Map.Entry<String,Date> pair: map.entrySet()){
    if(pair.getValue().getMonth()>4&&pair.getValue().getMonth()<8)
map.remove(pair.getKey());
}
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for(Map.Entry<String,Date> pair: map.entrySet()){
            System.out.println(pair.getKey()+" "+pair.getValue());
        }
    }
}
