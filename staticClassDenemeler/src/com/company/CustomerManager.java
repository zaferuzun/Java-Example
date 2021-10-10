package com.company;

public class CustomerManager {

    //static method
    //static yine bu nesnenin örnegini oluþturuyor lakin 1 kere oluþuyor ve bütün kullanýcýlar bunu kullanýr.
    //Genel kullanýmý araç amacýyla kullanýmlarda bulunur. Utility
    //normal newlenerek oluþturulan nesneler bellekte oluþturulup
    // iþi bitince atýlýyor lakin static program sonlanana kadar belleklten atýlmýyor.
    //ilk kullanýcý nesneyi çagýrmasýyla oluþturuluyor daha sonra diger kullanýcýlar ayný nesneyi kullanýyor.
    //constructor çalýþtýrmaz c#da çalýþtýrýrlar.
    //Static constructor tanýmlanýrsa çalýþýr
    //static constructor varsa newlenerek obje oluþturuldugunda static const çalýþýr
    //birçok static const oluþturulabilir hepsi çalýþýr
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
