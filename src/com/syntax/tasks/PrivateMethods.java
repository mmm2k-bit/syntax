package com.syntax.tasks;

public class PrivateMethods {
    int num;
    String s;

    public void setNum(int num) {
        this.num = num;
    }

    public void setS(String s) {
        this.s = s;
    }

    private void priv(){
        System.out.println("this is a private method no param");
    }
    private void priv(int m){
        System.out.println("this is a private method int param"+num);
    }
    private void priv(String f){
        System.out.println("this is a private method string param"+s);
    }

    public static void main(String[] args) {
        PrivateMethods pm = new PrivateMethods();
      pm.priv();
      pm.priv(3);
      pm.priv("sdf");
    }
}
