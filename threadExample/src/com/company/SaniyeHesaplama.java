package com.company;

public class SaniyeHesaplama {
    long startTime ;
    long estimatedTime;
    long endTime;
    public void saniyeHesaplamaBaslat(){
        startTime=System.currentTimeMillis();
    }
    public long kacSaniyeGecti(){
        endTime= System.currentTimeMillis();
        estimatedTime= endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
        return estimatedTime;
    }

    public void sifirla(){
        this.startTime =0;
        this.estimatedTime=0;
        this.endTime=0;
    }
}
