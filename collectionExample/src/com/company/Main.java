package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ICollection[] iCollections=new ICollection[]{new ArrayListExample(),new HashMapExample()};
        UtilityManager utilityManager=new UtilityManager();
        utilityManager.classListele(iCollections);
        //spesifik deneme yapmak için eklendi
        //utilityManager.ArrayListRemove(1);



    }
}
