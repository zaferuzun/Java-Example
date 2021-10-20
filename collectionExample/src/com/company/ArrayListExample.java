package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListExample implements ICollection {
    //Arraylistler dizilerin yönetilmesini kolaylaştıran veri yapısıdır
    //her türlü veri eklenebilir lakin spesifik bir durumda da kullanılabilir.Str Int
    //Object olarak for döngüsüne verilebilir egerki belirtilmemişse
    //Type Safe Tip güvenli durum ile kullanımı daha iyidir ArrayList<String>
    public ArrayList arrayList=new ArrayList();
    ArrayList<String> stringArrayList =new ArrayList<String>();
    ArrayList<String> stringArrayList2 =new ArrayList<>();
    ArrayList<Integer> intArrayList = new ArrayList<Integer>();

    ArrayListExample(){
        arrayList.add(11);
        arrayList.add("deneme");
        arrayList.add(1.22);
        arrayList.add(44);

        // XX stringArrayList.add(2);
        stringArrayList.add("str arraylist1");

        // XX stringArrayList.add("dasdas");
        intArrayList.add(1);

        // XX stringArrayList2.add(2);
        stringArrayList2.add("str arraylist2");
        //arrayList for () index1-11 index2-"deneme" index3-1.22
        //arrayList.size();
        //arrayList.set(index,deger); arrayList.set(1,100);
        //arrayList.get(index);  arrayList.get(1); == "deneme"
        //arrayList.remove(index); arrayList.remove(1); 11 1.22
        //arrayList.clear()
        //Collection.sort(arrayList); sıralama
        //** ArrayList<Model> olarak tanımlanan bir arrayliste eleman ekleme olayı
        // modelList.add(new Model()) şeklinde olmaktadır.
        //modelList.remove (new Model()) dendiginde bu obje tekrardan oluşacagı için aslında silinmez.
        // Model model = new Model() şeklinde tanımlanım eklenseydi. ve modelList.remove(model) olarak yazılsaydı
        // model referans tuttugu için modelList'ten bu kısım silinirdi.
        //ArrayList<Model> models = new ArrayList<Model>();
        //Model model = new Model();
        //models.add(model);
        //models.remove(model);

    }

    @Override
    public Collection defaultGetir() {
        return arrayList;
    }

    @Override
    public Collection strGetir() {
        return stringArrayList;
    }

    @Override
    public Collection str2Getir() {
        return stringArrayList2;
    }

    @Override
    public Collection intGetir() {
        return intArrayList;
    }
}
