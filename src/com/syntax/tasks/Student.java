package com.syntax.tasks;

public class Student {
    String subject;
    int grade;
    String school;

    public void homework(){
        System.out.println("student is doing homework at home");
    }
    public int gradeNextYear(int grade){
        if (grade>12){
            return -1;

        }else {
            this.grade=grade+1;
            return this.grade;
        }
    }

    public void funTime(){
        System.out.println("student likes to go to movies");
    }
}
