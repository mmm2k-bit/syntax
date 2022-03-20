package com.syntax.tasks;

public class Book {
    private int num;
    private String name;

    public Book( int num, String name){
        this.num=num;
        this.name=name;
    }
    public Book(){
        this(6,"empty constructor");

    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }
}
