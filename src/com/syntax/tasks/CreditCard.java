package com.syntax.tasks;

public class CreditCard {
    double balance;
    double interest;

    public double balan (double balance){
        this.balance=balance;
        this.interest=0;
        if(this.balance<100){
            return this.interest;

        }else if (this.balance>=100||this.balance<500){
            this.interest=0.12;
            return this.interest;
        }else if(this.balance>=500||this.balance<1000){
            this.interest=0.18;
            return this.interest;
        }else{
            this.interest=0.20;
            return this.interest;
        }
    }
}
