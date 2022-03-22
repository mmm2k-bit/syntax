package com.syntax.homework;

import com.syntax.tasks.CollegeStudent;
import com.syntax.tasks.SchoolStudent;
import com.syntax.tasks.Student;
import com.syntax.tasks.SyntaxStudebt;

public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        SyntaxStudebt syn = new SyntaxStudebt();
        CollegeStudent col = new CollegeStudent();
        SchoolStudent sch = new SchoolStudent();
        s.homework();
        System.out.println(s.gradeNextYear(3));
        s.funTime();
        syn.funTime();
        syn.homework();
        syn.goals();
        col.funTime();
        col.homework();
        System.out.println(col.gradeNextYear(2));
        sch.futureDegree("engineer");
        sch.funTime();
        sch.homework();
    }
}
