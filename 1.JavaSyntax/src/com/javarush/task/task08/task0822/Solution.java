package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        int min=Integer.MAX_VALUE;
        for(Integer i:array){
            if(min>i) min=i;
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        reader.skip(1L);
        for(int i=0;i<N;i++){
            list.add(Integer.parseInt(reader.readLine()));
            if(i!=N-1) reader.skip(1L);
        }
        // Создать и заполнить список тут
        return list;
    }
}
