package com.company;

public class CustomerManager {

    //static method
    //static yine bu nesnenin �rnegini olu�turuyor lakin 1 kere olu�uyor ve b�t�n kullan�c�lar bunu kullan�r.
    //Genel kullan�m� ara� amac�yla kullan�mlarda bulunur. Utility
    //normal newlenerek olu�turulan nesneler bellekte olu�turulup
    // i�i bitince at�l�yor lakin static program sonlanana kadar belleklten at�lm�yor.
    //ilk kullan�c� nesneyi �ag�rmas�yla olu�turuluyor daha sonra diger kullan�c�lar ayn� nesneyi kullan�yor.
    //constructor �al��t�rmaz c#da �al��t�r�rlar.
    //Static constructor tan�mlan�rsa �al���r
    //static constructor varsa newlenerek obje olu�turuldugunda static const �al���r
    //bir�ok static const olu�turulabilir hepsi �al���r
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
