package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum=Integer.MIN_VALUE;
        int N=-1;
while(true){
    N=Integer.parseInt(reader.readLine());
    if (N>0) {break;}
    reader.skip(1L);
}
for (int i=0;i<N;i++){
    reader.skip(1L);
    int temp =Integer.parseInt(reader.readLine());
    if (maximum<temp){
        maximum=temp;
    }

}
        //напишите тут ваш код

        System.out.println(maximum);
    }
}
