package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
       ArrayList<int[]> mas = new ArrayList<>();
       mas.add(new int[]{1,2,3,4,5});
        mas.add(new int[]{1,2});
        mas.add(new int[]{1,2,3,4});
        mas.add(new int[]{1,2,3,4,5,6,7});
        mas.add(new int[]{});
     return mas;   //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
