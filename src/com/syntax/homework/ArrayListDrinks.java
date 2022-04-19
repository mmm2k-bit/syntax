package com.syntax.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDrinks {
    public static void main(String[] args) {
        ArrayList<String>drinks = new ArrayList<String>();
        drinks.add("coke");
        drinks.add("juice");
        drinks.add("vodka");
        drinks.add("milk");
        drinks.add("coffee");

      for (int i=0; i< drinks.size();i++){
          if (drinks.get(i).contains("e")||drinks.get(i).contains("a")){
              drinks.set(i,"water");
          }
      }
        System.out.println(drinks.toString());

    }
}
