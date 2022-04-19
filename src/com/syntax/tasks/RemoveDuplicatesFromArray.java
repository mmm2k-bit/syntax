package com.syntax.tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);

        HashSet<String> newAList= new HashSet<>(aList);

        System.out.println(newAList);




    }
}
