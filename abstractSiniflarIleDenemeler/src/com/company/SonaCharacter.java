package com.company;

public class SonaCharacter extends BaseCharacter {

    public SonaCharacter(){
        super.name="Sona";
        super.level=1;
        this.healt();
    }

    @Override
    public int attackPower() {
        return 8;
    }

    @Override
    public void healt() {
        healt=110;
    }
}
