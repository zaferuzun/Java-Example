package com.company;

public class kosul {
    void kosulKont()
    {
        int x=10;
        boolean y=false;

//        if((y==false)&& (x+=10==20))
//        if((y==false)|| (x+=10==20))
//        if((y==false)|| ((x+=10)==20))
//        if((y==false)&& ((x+=10)==20))
        if((y==false)&& ((x+=10)==20))
        {
            System.out.println("true"+x);
        }
        else
        {
            System.out.println("else"+x);
        }
    }
}
