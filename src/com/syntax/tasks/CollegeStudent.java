package com.syntax.tasks;

public class CollegeStudent extends Student{

    @Override
    public void homework(){
        System.out.println("student is doing homework in library");
    }
    @Override
    public int gradeNextYear(int grade){
        if (grade>4||grade<1){
            return -1;

        }else {
            super.grade=grade+1;
            return super.grade;
        }
    }
    @Override
    public void funTime(){
        System.out.println("student likes to go to paries");
    }

    public double studentLoanDebt(int perYear){
        double total=perYear*4;
        return total;
    }
}
