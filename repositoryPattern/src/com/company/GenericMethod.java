package com.company;

public class GenericMethod {
    //bazen classı degilde içerisinde bulundugu methodları generic yapılması gerekir.
    public <T> void  generic (T generic){

    }
    //generic methodlarda da kısıtlama yapılabiliyor
    public <T extends IEntity> void  generic (T entity){

    }
}
