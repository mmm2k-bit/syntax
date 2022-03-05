package com.syntax.homework;

public class Student {
    private String Name;
    private int ID;
    public static int NumOfStudents;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
     public void addStud(){
        NumOfStudents+=1;

     }

}
