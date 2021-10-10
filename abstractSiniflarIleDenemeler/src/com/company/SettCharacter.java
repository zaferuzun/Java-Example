package com.company;

public class SettCharacter extends BaseCharacter {

    public  SettCharacter(){
        super.name="Sett";
        super.level=1;
        this.healt();
    }
    @Override
    public int attackPower() {
        return 10;
    }

    @Override
    public void healt() {
        healt=100;
    }
}
