package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
    Human human1 =new Human("1",true,1);    // напишите тут ваш код
        Human human2 =new Human("2",false,2);
        Human human3 =new Human("3",true,3);
        Human human4 =new Human("4",false,4);
        Human human5 =new Human("5",true,5,human1,human2);
        Human human6 =new Human("6",false,6,human2,human3);
        Human human7 =new Human("7",true,7,human3,human4);
        Human human8 =new Human("8",false,8,human4,human1);
        Human human9 =new Human("9",true,9,human1,human2);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);
    }

    public static class Human {
       String name; // напишите тут ваш код
boolean sex;
int age;
Human father,mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}