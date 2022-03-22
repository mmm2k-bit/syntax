package com.syntax.tasks;

public class AX extends CreditCard{
    @Override
    public double balan (double balance){
        this.balance=balance;
        this.interest=0;
        if(this.balance<100){
            this.interest=0.5;
            return this.interest;

        }else if (this.balance>=100||this.balance<500){
            this.interest=0.15;
            return this.interest;
        }else if(this.balance>=500||this.balance<1000){
            this.interest=0.20;
            return this.interest;
        }else{
            this.interest=0.25;
            return this.interest;
        }
    }

    public static void main(String[] args) {
        CreditCard c = new CreditCard();
        AX a = new AX();
        Visa v = new Visa();
        System.out.println(c.balan(1233.45));
        System.out.println(a.balan(45.5));
        System.out.println(v.balan(356.6));
    }
}
