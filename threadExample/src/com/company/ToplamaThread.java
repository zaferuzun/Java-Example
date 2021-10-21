package com.company;

import java.util.concurrent.CountDownLatch;

public class ToplamaThread  implements Runnable{

    private Thread thread;
    private String threadName;
    public long total;
    private long sayi1;
    private long sayi2;
    CountDownLatch latch;


    public ToplamaThread(String threadName,long sayi1,long sayi2,CountDownLatch latch) {
        this.threadName=threadName;
        this.sayi1=sayi1;
        this.sayi2=sayi2;
        this.latch=latch;
    }
    public void degerSetle(int sayi1,int sayi2){
        this.sayi1=sayi1;
        this.sayi2=sayi2;
    }
    @Override
    public void run() {
        try {
            for (long i=sayi1;i<sayi2;i++)
                total+=i;
            System.out.println(threadName+" = "+total);
        }catch (Exception e){
            System.out.println("hata oluştu");
        }

        if(latch != null)
            latch.countDown();
    }
    //standart verilen isim
    public void  start(){
        if(thread==null){
            this.thread=new Thread(this,threadName);
            thread.start();
        }
    }
}
