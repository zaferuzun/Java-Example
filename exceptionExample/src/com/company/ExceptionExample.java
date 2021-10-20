package com.company;

public class ExceptionExample {
    //Throwable
    //Exception ve Error olarak ayrılır.
    //Exception uygulamada aldıgımız, yazdıgımız kodlardan ortaya çıkan hatalar
    //kodlarla kontrol altına alabiliyoruz.
    //Error kontrol altına alamadıgımız hatalar try catch finally
    //Sanal makine hatası
    //RuntimeExceptionlar unchecked exception olarak tanımlanır
    //Programcı try catch ile kontrol altına alması gerekiyor.
    //IOException SQLException AWTException  checked exception olarak ele alınır.
    //Bu hataların oluşabilecegi kodlarda Java uyarı veriyor bu hataların handle edilmesini sağlar

    public void ExceptionExam(){
        try {
            //hata olabilecegini düşündügümüz kod blogu
        }
        catch (StringIndexOutOfBoundsException e){
            //spesifik bir hatayı belirledigimiz durum
        }
        catch (ArithmeticException e){
            //spesifik bir hatayı belirledigimiz durum
        }
        catch (Exception e){
            //egerki belirledigimiz hata dışında farklı bir hata alınırsa belirledigimiz durum
        }
        finally {
            //hata olsada olmasada yapılacakların yazıldıgı blok
        }
    }

    public void Kontrol(int number1,int number2){

    }

}
