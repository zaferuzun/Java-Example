package com.company;

public class KontrolException extends Exception{
    String message;
    public KontrolException(String message){
        this.message=message;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
