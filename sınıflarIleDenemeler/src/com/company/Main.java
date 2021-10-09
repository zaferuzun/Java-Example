package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        CarUI carUI=new CarUI();

        //Base class extend
        carUI.MarkaDondur(new FiatCarManager());
        carUI.MarkaDondur(new HondaCarManager());
        /*****/
        //bu class�n carUI k�sm�nda fonksiyonu bulunmuyor lakin baseclass�n fonksiyonu bulundugu i�in hata alm�yoruz.
        carUI.MarkaDondur(new OpelCarManager());
        //Interface class implement
        carUI.MarkaDondur(new FiatCarManager2());
        carUI.MarkaDondur(new HondaCarManager2());

        //foreach Base class
        System.out.println("----------");
        System.out.println("D�ng�");
        BaseCarManager[] cars=new BaseCarManager[]{new FiatCarManager(),new HondaCarManager()};

        for (BaseCarManager car:cars) {
            car.MarkaDondur();
        }
        System.out.println("----------");
        //constructor olarak base g�nderilip extend edilmi� �gelere ula�ma
        CarUI carUI2 =new CarUI(new HondaCarManager());
        carUI2.MarkaDondur();

        System.out.println("----------");

        //constructor olarak base g�nderilip extend edilmi� �gelere ula�ma
        CarUI carUI3 =new CarUI(new HondaCarManager2());
        carUI3.MarkaDondur2();
    }
}
