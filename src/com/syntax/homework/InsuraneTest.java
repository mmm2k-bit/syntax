package com.syntax.homework;

import java.util.ArrayList;

import java.util.ListIterator;

public class InsuraneTest {
    public static void main(String[] args) {
        Insurance carInsur = new Car();
        Insurance petInsur = new Pet();
        Insurance healthInsur = new Helth();

        ArrayList<Insurance> allInsur = new ArrayList();
        allInsur.add(carInsur);
        allInsur.add(petInsur);
        allInsur.add(healthInsur);

        for (Insurance u: allInsur){
            u.cancelInsurance();
            u.getQuote();
        }
        System.out.println("******************");
for (int i=0; i<allInsur.size(); i++){
    allInsur.get(i).cancelInsurance();
    allInsur.get(i).getQuote();
}
        System.out.println("********************");

        ListIterator<Insurance>iter = allInsur.listIterator();
while(iter.hasNext()){
    iter.previous();
    iter.next().cancelInsurance();
    iter.next().getQuote();

}


    }
}
