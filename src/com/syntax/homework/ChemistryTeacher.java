package com.syntax.homework;

public class ChemistryTeacher extends Teacher{
    double salary;
    String favStudent;

    public ChemistryTeacher(String fname, String lname, double salary, String favStudent) {
        super(fname, lname);
        this.salary = salary;
        this.favStudent = favStudent;
    }

    public ChemistryTeacher(double salary) {
        super("asd", "sdfsf");

        this.salary = salary;
    }
    @Override
    public void gradeHomwork(){
        System.out.println("Chemistry teacher is grading ");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFavStudent() {
        return favStudent;
    }

    public void setFavStudent(String favStudent) {
        this.favStudent = favStudent;
    }
}
