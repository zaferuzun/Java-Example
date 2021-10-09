package com.company;

public class Main {

    public static void main(String[] args) {

    //abstract classlara newlenemez. Tek baþýna kullanýlamaz
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
        System.out.println("Dövüþü " + sett.name+ " kazandý"+ " Can degeri ="+ sett.healt);
    else if (!sett.dead())
        System.out.println("Dövüþü " + sona.name+ " kazandý"+ " Can degeri ="+ sona.healt);
    else
        System.out.println("Dövüþ berabere bitti.");


    }
}
