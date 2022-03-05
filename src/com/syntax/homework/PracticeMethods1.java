package com.syntax.homework;

public class PracticeMethods1 {

    int addArr(int[] arr){
        int sum=0;
        for (int i=0; i<arr.length;i++){
            sum+=arr[i];

        }return sum;
    }

    public StringBuilder rev(String q){
        StringBuilder w = new StringBuilder(q);
        return w.reverse();
    }

    private static String vow (String asd){
        String ne = "";
        for (int i=0; i<asd.length();i++){
            String f = String.valueOf(asd.charAt(i));
            if (f.equals("a")||f.equals("o")){
                ne+=f;
            }
        }
        return ne;

    }

    public static void main (String[]args){
String asdf = PracticeMethods1.vow("Sdfsdfaosssao");
System.out.println(asdf);
    }
}
