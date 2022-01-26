package com.company;


import java.util.ArrayList;

//<> içerisine yazılan şey farketmez lakin bu bir isimlendirme standartıdır.
//Type'ı temsil eder
public class genericClass <T> {
    //ArrayList<String> genericlige örnektir.
    //java tip güvenli bir dildir.
    //new ArrayList<> içerisine type belirtilmesede oluyor lakin okunurluk bakımında önemlidir.
    ArrayList<String> tipGuvenli =new ArrayList<String>();
    //yaptıgımız işler aynıdır lakin verdigimiz nesne degişir.
    //bu sebeple hepsine aynı işlemleri yapan classlar yazmak yerine
    //bu şekilde generic classlar yazarız

    //burda yapılan işlem ise T türünden bir obje ile işlem yapılacagını bildirir.
    //T türü ne gönderilirse onun yerine geçecektir.
    public void add(T object){

    }
}
