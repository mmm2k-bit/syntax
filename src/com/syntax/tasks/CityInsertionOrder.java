package com.syntax.tasks;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CityInsertionOrder {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<String>();
        cities.add("Amsterdam");
        cities.add("Ankara");
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Los Angeles");


        Iterator<String> d = cities.iterator();
        while(d.hasNext()){
            if(d.next().startsWith("A")){
                d.remove();
            }
        }
        System.out.println(cities);


    }
}
