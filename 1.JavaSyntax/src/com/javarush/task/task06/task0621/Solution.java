package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dedName = reader.readLine();
        Cat catDed = new Cat(dedName,null,null);
        reader.skip(1L);
        String babaName = reader.readLine();
        Cat catBaba = new Cat(babaName, null,null);
        reader.skip(1L);
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,catBaba,null);
        reader.skip(1L);
        String papaName = reader.readLine();
        Cat catPapa = new Cat(papaName, null,catDed);
        reader.skip(1L);
        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother,catPapa);
        reader.skip(1L);
        String dochaName = reader.readLine();
        Cat catDocha = new Cat(dochaName, catMother,catPapa);

        System.out.println(catDed);
        System.out.println(catBaba);
        System.out.println(catPapa);
        System.out.println(catMother);
        System.out.println(catDocha);
        System.out.println(catSon);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat papa;


        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent, Cat papa) {
            this.name = name;
            this.parent = parent;
            this.papa = papa;
        }

        @Override
        public String toString() {
            if (parent == null&&papa ==null)
            {return "The cat's name is " + name + ", no mother, no father";}
            else if (parent == null)
            {return "The cat's name is " + name + ", no mother, father is " + papa.name;}
            else if (papa==null){
                return "The cat's name is " + name + ", mother is "+parent.name+", no father";
            } else {
                return "The cat's name is " + name + ", mother is "+parent.name+", father is "+papa.name;
            }

        }
    }

}
