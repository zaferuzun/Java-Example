package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        CarUI carUI=new CarUI();

        //Base class extend
        carUI.MarkaDondur(new FiatCarManager());
        carUI.MarkaDondur(new HondaCarManager());
        /*****/
        //bu classýn carUI kýsmýnda fonksiyonu bulunmuyor lakin baseclassýn fonksiyonu bulundugu için hata almýyoruz.
        carUI.MarkaDondur(new OpelCarManager());
        //Interface class implement
        carUI.MarkaDondur(new FiatCarManager2());
        carUI.MarkaDondur(new HondaCarManager2());

        //foreach Base class
        System.out.println("----------");
        System.out.println("Döngü");
        BaseCarManager[] cars=new BaseCarManager[]{new FiatCarManager(),new HondaCarManager()};

        for (BaseCarManager car:cars) {
            car.MarkaDondur();
        }
        System.out.println("----------");
        //constructor olarak base gönderilip extend edilmiþ ögelere ulaþma
        CarUI carUI2 =new CarUI(new HondaCarManager());
        carUI2.MarkaDondur();

        System.out.println("----------");

        //constructor olarak base gönderilip extend edilmiþ ögelere ulaþma
        CarUI carUI3 =new CarUI(new HondaCarManager2());
        carUI3.MarkaDondur2();
    }
}
