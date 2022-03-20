package com.syntax.homework;

import com.syntax.tasks.Book;

public class TestConstructorMore {
    public static void main (String[]args){
        ConstructorMore c1=new ConstructorMore();
        ConstructorMore c2=new ConstructorMore(4,5.6,"bob");
//        ConstructorMore c3=new ConstructorMore(6,0.4);//private can't acccess
        ConstructorMore c4=new ConstructorMore(6,"wr");

Student2 stud = new Student2("grg","sdfsd 324 234 dfs");
stud.displayNames();

Book b = new Book(7,"wer");
        Book bc = new Book();

        System.out.println(b.getName());
        System.out.println(bc.getName());
    }
}
