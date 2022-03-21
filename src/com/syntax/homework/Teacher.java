package com.syntax.homework;

public class Teacher {
    String fname;
    String lname;
    int numStudents;
    public static String schoolName="New School";

    public void gradeHomwork(){
        System.out.println("teacher is grading ");
    }


    public Teacher(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }
}
