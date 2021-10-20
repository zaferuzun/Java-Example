package com.company;

public class InitializeClass {
    static String name ="name1";
    public InitializeClass() {
        System.out.println("Constructor");
    }
    {
        System.out.println(name);
        System.out.println("Empty block");
        name="name3";
    }
    static{
        System.out.println(name);
        System.out.println("Static name");
        name="name2";
    }
    static {
        System.out.println("Static");
    }

}
