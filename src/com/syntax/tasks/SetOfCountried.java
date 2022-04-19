package com.syntax.tasks;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetOfCountried {
    public static void main(String[] args) {
        Set<String> countries = new TreeSet<>();
        countries.add("Africa");
        countries.add("USA");
        countries.add("Brazil");
        countries.add("Italy");
        countries.add("France");
        System.out.println(countries);
        for (String s:countries){
            System.out.println(s);
        }
        System.out.println("*********************");
        Iterator<String>iter = countries.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }


    }
}
