package com.syntax.homework;

public class Student2 {
    private String name;
    private String address;

    public Student2(String name, String address){
        this.name=name;
        this.address=address;
    }
    public void displayNames(){
        System.out.println("name "+this.name+" address "+this.address);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
