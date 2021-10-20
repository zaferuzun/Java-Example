package com.company;

import com.company.ExceptionExample;
import com.company.KontrolException;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        LocalDateTime myDateObj = LocalDateTime.now();
//        LocalDateTime myDateObj2 = LocalDateTime.now();
//        String str="d";
//        String str2="d";
//        System.out.println(str==str2);
//        System.out.println(myDateObj.equals(myDateObj2));
//        System.out.println(myDateObj);
//        System.out.println(myDateObj2);
//        InitializeClass initializeClass=new InitializeClass();
//        System.out.println(initializeClass.name);

        ExceptionExample exceptionExample=new ExceptionExample();
        try {
            exceptionExample.Kontrol(1,2);

        }catch (KontrolException kontrolException){
            System.out.println(kontrolException.getMessage());
        }

    }
}
