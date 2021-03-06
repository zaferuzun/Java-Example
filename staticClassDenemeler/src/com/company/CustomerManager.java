package com.company;

public class CustomerManager {

    //static method
    //static yine bu nesnenin örnegini oluşturuyor lakin 1 kere oluşuyor ve bütün kullanıcılar bunu kullanır.
    //Genel kullanımı araç amacıyla kullanımlarda bulunur. Utility
    //normal newlenerek oluşturulan nesneler bellekte oluşturulup
    // işi bitince atılıyor lakin static program sonlanana kadar belleklten atılmıyor.
    //ilk kullanıcı nesneyi çagırmasıyla oluşturuluyor daha sonra diger kullanıcılar aynı nesneyi kullanıyor.
    //constructor çalıştırmaz c#da çalıştırırlar.
    //Static constructor tanımlanırsa çalışır
    //static constructor varsa newlenerek obje oluşturuldugunda static const çalışır
    //birçok static const oluşturulabilir hepsi çalışır
    //Java ana class static olamaz
    //inner class static olabilir
    public void add(Customer customer){
        if(CustomerValidator.isValidCustomer(customer))
            System.out.println("Eklendi");
        else
            System.out.println("Eklenmedi");
    }
    //default method
    public void add2(Customer customer){
        CustomerValidator customerValidator=new CustomerValidator();
        if(customerValidator.isValidCustomer2(customer))
            System.out.println("Eklendi");
        else
            System.out.println("Eklenmedi");
    }
    public void add3(Customer customer){
        if(CustomerValidator.CustomerValidatorStatic.isValidCustomer3(customer))
            System.out.println("Eklendi");
        else
            System.out.println("Eklenmedi"); 
    }

}
