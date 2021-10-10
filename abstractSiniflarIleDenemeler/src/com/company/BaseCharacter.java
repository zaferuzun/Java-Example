package com.company;

public abstract class BaseCharacter {

    public int healt;
    public String name;
    public int level;

    public void experience(){
        level+=10;
    }
    public abstract int attackPower();
    public abstract void healt();

    public boolean dead(){
        if(healt<0)
            return false;
        else
            return true;
    }
    public void healtLoss(int damage)
    {
        healt=healt-damage;
    }

}
