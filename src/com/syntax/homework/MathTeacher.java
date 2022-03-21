package com.syntax.homework;

public class MathTeacher extends Teacher {
    int numOfClasses;

    void prepClass() {
        System.out.println("math teacher is prepping for class");
    }
    String prepClass(int hours) {
        return "it takes "+hours+"to prep for the class";
    }
    @Override
    public void gradeHomwork(){
        System.out.println("math teacher is grading homework");
    }

    public MathTeacher(String fname, String lname, int numOfClasses) {
        super(fname, lname);
        this.numOfClasses = numOfClasses;
    }

    public MathTeacher(int numOfClasses) {
        super("Tom", "Johnson");
        this.numOfClasses = numOfClasses;
    }

    public void setNumOfClasses(int numOfClasses) {
        this.numOfClasses = numOfClasses;
    }
}