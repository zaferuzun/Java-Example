package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FileManager fileManager=new FileManager("deneme2.txt");
        try {
            fileManager.writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileManager.getFileName();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            fileManager.readFile();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
