package com.syntax.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("sdfe");
        words.add("elephant");
        words.add("water");
        words.add("nothing");
        words.add("these");
        words.add("sdfsdfe");

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()){
            if(iterator.next().endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(words.toString());
    }
}
