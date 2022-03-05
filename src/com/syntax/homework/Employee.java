package com.syntax.homework;

public class Employee {
    private int empID;
    private double salary;
    static String CEO="Samir";

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public int getEmpID() {
        return empID;
    }
    public double getSalary(){
        return salary;
    }

    public static void setCEO(String CEO) {
        Employee.CEO = CEO;
    }

    public String getCEO(){
        return CEO;
    }
}
