package com.company;

import java.util.Collection;

public class CollectionManager {
    ICollection iCollection;

    CollectionManager(ICollection iCollection){
        this.iCollection=iCollection;
    }

    public Collection defaultGetir()
    {
        return iCollection.defaultGetir();
    }
    public Collection strGetir()
    {
        return iCollection.strGetir();
    }
    public Collection str2Getir()
    {
        return iCollection.str2Getir();
    }
    public Collection intGetir()
    {
        return iCollection.intGetir();
    }
}
