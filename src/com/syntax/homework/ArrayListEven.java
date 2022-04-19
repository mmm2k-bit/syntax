package com.syntax.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEven {
    public static void main(String[] args) {
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        for (int i=1;i<501; i++){
            if (i%2==0){
                evenList.add(i);
            }
        }
        Iterator<Integer> iterator = evenList.iterator();
        while(iterator.hasNext()){
            if(iterator.next()%5==0){
                iterator.remove();
            }
        }
        System.out.println(evenList.toString());

    }
}
