package com.company;

import java.util.Collection;

public class UtilityManager {

    public void ekranaBas(Collection collections){
        for (Object collection:collections
             ) {
            System.out.println(collection);
        }
        System.out.println("---------------");
    }

    public void classListele(ICollection[] iCollections){

        for (ICollection iCollection:iCollections
             ) {
            CollectionManager collectionManager= new CollectionManager(iCollection);
            //get className
            String className = iCollection.getClass().getSimpleName();
            System.out.println(className);
            System.out.println("defaultGetir()");
            ekranaBas(collectionManager.defaultGetir());
            System.out.println("intGetir()");
            ekranaBas(collectionManager.intGetir());
            System.out.println("str2Getir()");
            ekranaBas(collectionManager.str2Getir());
            System.out.println("strGetir()");
            ekranaBas(collectionManager.strGetir());
        }

    }

    public void ArrayListRemove(int index){
        ArrayListExample arrayListExample=new ArrayListExample();
        arrayListExample.arrayList.remove(index);
        ekranaBas(arrayListExample.arrayList);
    }

}
