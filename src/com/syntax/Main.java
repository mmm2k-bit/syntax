package com.syntax;

import com.syntax.tasks.StudentConstructor;

public class Main {

    public static void main(String[] args) {
        StudentConstructor stud1=new StudentConstructor("tom", 3,4,5);
        StudentConstructor stud2 = new StudentConstructor("bob",45,56,76);
        StudentConstructor stud3 = new StudentConstructor("sam",567,678,245);
        StudentConstructor stud4 = new StudentConstructor("tol", 45,56,1);
        StudentConstructor stud5 = new StudentConstructor("asd",78,90,1999);

        stud1.AverageGrade();
        stud2.AverageGrade();
        stud3.AverageGrade();
        stud4.AverageGrade();
        stud5.AverageGrade();

    }
}
