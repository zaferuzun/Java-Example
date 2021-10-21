package com.company;

import java.util.Collection;
import java.util.HashMap;

public class HashMapExample implements ICollection{
    //key value
    //sırayla gelmiyor kendi algoritmasına göre getirir.

    HashMap<Object,Object> hashMap=new HashMap<Object,Object>();
    HashMap<String,String> strhashMap=new HashMap<String,String>();
    HashMap<String,Integer> str2hashMap=new HashMap<String,Integer>();
    HashMap<Integer,Integer> inthashMap=new HashMap<Integer,Integer>();


    public HashMapExample(){
        hashMap.put("deneme",1);
        hashMap.put(1,1.2);

        strhashMap.put("strdeneme","hashmap");

        str2hashMap.put("str2deneme",2);

        inthashMap.put(1,40);


        //hashMap.remove(key);
        //hashMap.get(key);
        //hashMap.clear();
        //hashMap.size();
        //hashMap.keySet() anahtar listesi
    }

    @Override
    public Collection defaultGetir() {
        return (Collection) hashMap;
    }

    @Override
    public Collection strGetir() {
        return (Collection) strhashMap;
    }

    @Override
    public Collection str2Getir() {
        return (Collection) str2hashMap;
    }

    @Override
    public Collection intGetir() {
        return (Collection) inthashMap;
    }
}
