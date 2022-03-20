package com.syntax.tasks;

public class StudentConstructor {
    private String name;
    private int grade1;
    private int grade2;
    private int grade3;

    public StudentConstructor(String name, int grade1, int grade2, int grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public void AverageGrade(){

        int sum = (this.grade1+this.grade2+this.grade3)/3;
        System.out.println(this.name+" average grade is "+sum);
    }

    public String getName() {
        return name;
    }

    public int getGrade1() {
        return grade1;
    }

    public int getGrade2() {
        return grade2;
    }

    public int getGrade3() {
        return grade3;
    }
}
