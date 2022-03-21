package com.syntax.tasks;

public class UserInfo extends UserClass{
    private String address;

    public UserInfo(String number, String name, String address) {
        super(number, name);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void userDetails(){
        System.out.println("User name: "+super.getName()+". User Number: "+super.getNumber()+". User Address: "+this.getAddress());
    }

    public static void main(String[] args) {
        UserClass classes = new UserClass("234-234-2323","John Snow");
        UserInfo info = new UserInfo("234=456=78=23","Ron Swanson", "123 main st Washington Dc");
        info.userDetails();
        System.out.println(classes.getName());
        System.out.println(classes.getNumber());
    }
}
