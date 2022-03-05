package com.syntax.homework;
import java.util.Scanner;

public class StringManipulation1 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String n= scan.nextLine();

        if (n.isEmpty()){
            System.out.println("You didn't enter anything");
        }else if ((n.length()%2!=0)&& (n.length()>3)){
           System.out.println(n.charAt(n.length()/2));

            }
        }

    }

