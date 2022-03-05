package com.syntax.tasks;
import com.syntax.homework.Employee;

public class ClassTest1 {

    public static void main (String[]args){
        Employee emp1 = new Employee();
        emp1.setSalary(56000.99);
        emp1.setEmpID(1);
        System.out.println(emp1.getSalary());
        System.out.println(emp1.getEmpID());
        System.out.println(emp1.getCEO());

        Employee emp2 = new Employee();
        emp2.setSalary(56.99);
        emp2.setEmpID(2);
        System.out.println(emp2.getSalary());
        System.out.println(emp2.getEmpID());
        System.out.println(emp2.getCEO());

    }
}
