package com.company;

public class CarUI {
    //Normal bir classý extend edilmesiyle oluþturulacak yöntem
    //olmamasý gereken
    public void MarkaDondur(FiatCarManager fiatCarManager)
    {
        fiatCarManager.MarkaDondur();
    }

    public void MarkaDondur(HondaCarManager hondaCarManager)
    {
        hondaCarManager.MarkaDondur();
    }
    /**********************************************/
    //olmasý gereken
    //referans tip**
    public void MarkaDondur(BaseCarManager baseCarManager){
        baseCarManager.MarkaDondur();
    }

    //Interface üzerinden oluþturulacak yöntem
    public void MarkaDondur(IBaseCar iBaseCar){
        iBaseCar.MarkaDondur();
    }

    //boþta kullanabilirim
    public CarUI()
    {
    }
    //constructor extend edilen class ile deneme
    private BaseCarManager baseCarManager;
    public CarUI(BaseCarManager baseCarManager)
    {
        this.baseCarManager=baseCarManager;
    }
    public void MarkaDondur(){
        baseCarManager.MarkaDondur();
    }
    //constructor interface edilen class ile deneme
    private IBaseCar iBaseCar;
    public CarUI(IBaseCar iBaseCar)
    {
        this.iBaseCar=iBaseCar;
    }
    public void MarkaDondur2(){
        iBaseCar.MarkaDondur();
    }
}
