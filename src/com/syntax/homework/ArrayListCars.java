package com.syntax.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCars {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("Toyota");
        cars.add("Jeep");
        cars.add("Nissan");
        cars.add("Chevrolet");

        System.out.println(cars.toString());

        for (int i=0; i<cars.size(); i++){
            System.out.print(cars.get(i)+" ");
        }
        System.out.println(" ");
        for (String car:cars){
            System.out.print(car+" ");
        }
        System.out.println(" ");
        Iterator<String> iterator = cars.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }


    }
}
