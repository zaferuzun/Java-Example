package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int latchGroupCount = 5;
        CountDownLatch latch = new CountDownLatch(latchGroupCount);

        //10 tane text dosyasına random(1-200000) herbirine 100.000 sayı at
        //random sayıları alıp küçükten büyüge sıralar başka bir texte yaz
        //min 3 design pattner kullan
        //her text dosyası asycn okunucak
        //@Asyc


        long total=0;
        //sıralı olmayan işlerde multi thread kullanılabilir
        int sayi=1000000000;
        int sayi2=10;
        List<ToplamaThread> allThreads = new ArrayList<>();
        SaniyeHesaplama saniyeHesaplama=new SaniyeHesaplama();
        saniyeHesaplama.saniyeHesaplamaBaslat();
        for(int i=1;i<=sayi;i++)
            total+=i;

        System.out.println(total);
        System.out.println(saniyeHesaplama.kacSaniyeGecti());
        saniyeHesaplama.sifirla();

//        ToplamaThread toplamaThread;
        saniyeHesaplama.saniyeHesaplamaBaslat();
        ToplamaThread toplamaThread;
        int say=1;
        ExecutorService es = Executors.newCachedThreadPool();

        for(int i=1;i<=5;i++){
            int bolum=sayi/5;
            int say2=say+bolum;
            String threadName="thread"+i;
            String degisken="toplamaThread"+i;
//            es.execute(toplamaThread=new ToplamaThread(threadName,say,say2));
            System.out.println(threadName+" ="+say+" "+say2);
            toplamaThread=new ToplamaThread(threadName,say,say2,latch);
            allThreads.add(toplamaThread);
            toplamaThread.start();
            say=say2;

        }
//        es.shutdown();
//        try {
//            boolean finished = es.awaitTermination(10, TimeUnit.MINUTES);
//            int total2=0;
//            for (ToplamaThread thread:allThreads
//            ) {
//                total2+=thread.total;
//            }
//            System.out.println(total2);
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        latch.await();
        long total2=0;
        for (ToplamaThread thread:allThreads
             ) {
            total2+= thread.total;
        }
        System.out.println(total2);
        System.out.println(saniyeHesaplama.kacSaniyeGecti());
        saniyeHesaplama.sifirla();
    }
}
