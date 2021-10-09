package com.company;

public class Main {

    public static void main(String[] args) {

    //abstract classlara newlenemez. Tek ba��na kullan�lamaz
    BaseCharacter sona=new SonaCharacter();
    BaseCharacter sett=new SettCharacter();

    while (sona.dead() && sett.dead()){
        System.out.println(sona.name+" "+ sett.name+"'e "+sona.attackPower()+" vurdu");
        sett.healtLoss(sona.attackPower());
        //System.out.println("Can degerleri "+sett.name+"= "+sett.healt+" "+sona.name+"= "+sona.healt);
        System.out.println(sett.name+" "+ sona.name+"'e "+sett.attackPower()+" vurdu");
        sona.healtLoss(sett.attackPower());
        // System.out.println("Can degerleri "+sett.name+"= "+sett.healt+" "+sona.name+"= "+sona.healt);
    }
    if(!sona.dead())
        System.out.println("D�v��� " + sett.name+ " kazand�"+ " Can degeri ="+ sett.healt);
    else if (!sett.dead())
        System.out.println("D�v��� " + sona.name+ " kazand�"+ " Can degeri ="+ sona.healt);
    else
        System.out.println("D�v�� berabere bitti.");


    }
}
