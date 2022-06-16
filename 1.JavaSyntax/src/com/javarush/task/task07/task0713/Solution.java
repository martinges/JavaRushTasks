package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       ArrayList<Integer> mas = new ArrayList<>(); //напишите тут ваш код
        ArrayList<Integer> mas1 = new ArrayList<>();
        ArrayList<Integer> mas2 = new ArrayList<>();
        ArrayList<Integer> mas3 = new ArrayList<>();
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       for(int i=0;i<20;i++){
           mas.add(Integer.parseInt(reader.readLine()));
           if(i!=19) reader.skip(1L);
       }
       for(int i=0;i<20;i++){
           if(mas.get(i)%3==0){
               mas1.add(mas.get(i));
           }else if(mas.get(i)%2==0){
               mas2.add(mas.get(i));
           } else {
               mas3.add(mas.get(i));
           }
       }
       printList(mas1);
        printList(mas2);
        printList(mas3);
    }

    public static void printList(ArrayList<Integer> list) {
       for(int i=0;i<list.size();i++){
           System.out.println(list.get(i));
       } //напишите тут ваш код
    }
}
