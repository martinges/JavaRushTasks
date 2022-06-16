package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //List<String> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        while (true) {
            String family = reader.readLine();
            reader.skip(1L);
            String city = reader.readLine();
            if (family.equals("end")) {
                break;
            }
            reader.skip(1L);
            //list.add(family);
            map.put(city,family);
        }

        // Read the house number
        //int houseNumber = Integer.parseInt(reader.readLine());
            String town = reader.readLine();
        System.out.println(map.get(town));
/*        if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
        }*/
    }
}
