package com.syntax.homework;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("this");
        arrayList.add("is");
        arrayList.add("a");
        arrayList.add("array");
        arrayList.add("lsit");
        System.out.println("Is this arraylist empty? " +arrayList.isEmpty());
        System.out.println("Doe the arraylist contain \"this\"? "+ arrayList.contains("this"));
        System.out.println("ArrayList size is "+arrayList.size());

    }
}
