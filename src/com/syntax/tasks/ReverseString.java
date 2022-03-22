package com.syntax.tasks;

public class ReverseString {
//    final String rev (String giv){
//
//        StringBuilder ne = new StringBuilder(giv);
//        StringBuilder reversed = new StringBuilder(ne.reverse());
//        String n = String.valueOf(reversed);
//        return n;
//    }
    final double avgElements(int[] arra){
        int count=0;
        double sum=0;
        for (int a:arra){
            sum+=a;
            count+=1;
        }
        double av = (sum/count);

        return av;

    }
    public static void main(String[] args) {
        ReverseString r = new ReverseString();
        int[] a = {2,7,3,8,4};
        System.out.println(r.avgElements(a)); //should print 4.8
    }
}
