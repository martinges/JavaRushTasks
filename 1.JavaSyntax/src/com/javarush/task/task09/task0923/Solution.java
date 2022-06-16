package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String string= reader.readLine();
        for(char c:string.toCharArray()){
            for(char c2:vowels){
                if(c==c2) {System.out.print(c+" ");
                break;}
            }
        }
        System.out.println();
        for(char c:string.toCharArray()){
            boolean bool=false;
            for(char c2:vowels){
                if(c==c2) bool=true;
            }
            if(!bool&&c!=' ') System.out.print(c+" ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}