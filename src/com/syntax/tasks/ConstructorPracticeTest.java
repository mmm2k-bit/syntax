package com.syntax.tasks;

import com.syntax.homework.ConstructorPractice;

public class ConstructorPracticeTest{

    public static void main (String []args){
        ConstructorPractice text = new ConstructorPractice();
        ConstructorPractice text2 = new ConstructorPractice("tom", 23,345.6666);
        System.out.println(text2.getAge());
        System.out.println(text2.getMoney());
        System.out.println(text2.getName());
    }
}
