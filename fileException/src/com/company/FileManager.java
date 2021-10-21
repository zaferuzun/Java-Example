package com.company;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class FileManager {

    String fileName;
    //file nesnesi ile çalışıyorsak bellege almadan işlemler gerçekleştirilir
    //buffered nesnesi bellege alıp işlemleri gerçekleştirir.
    public FileManager(String fileName){
        this.fileName=fileName;
    }
    //spesifik hata IOException
    public void fileCreate() throws Exception{

//        String basePathOfClass = getClass()
//                .getProtectionDomain().getCodeSource().getLocation().getFile();
//
//        System.out.println(basePathOfClass+fileName);
        File file = new File(fileName);
        //dosya üretir
        //üretirse true üretmezse false dönüyor
        if(file.createNewFile()){
            System.out.println("dosya oluşturuldu");
        }
        else {
            System.out.println("dosya zaten mevcut");
        }

    }
    public  void getFileName() throws Exception {
        File file =new File(fileName);
        if(file.exists()){
            System.out.println(file.getName()+" dosyası var");
            System.out.println(" dosya yolu"+ file.getAbsolutePath());
            System.out.println(" dosya yazılabilir mi= "+ file.canWrite());
            System.out.println(" dosya okunabilir mi= "+ file.canRead());
            System.out.println(" dosya yazılabilir mi= "+ file.canWrite());
            System.out.println(" dosya boyutu= "+ file.length()+" byte");
        }
        else {
            throw new Exception();
        }
    }

    public void readFile() throws FileNotFoundException {
        File file = new File(fileName);
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()){
            String line = reader.nextLine();
            System.out.println(line);
        }
        //kapatılması gerek
        reader.close();
    }

    public void writeFile() throws IOException {
        FileWriter fileWriter=new FileWriter(fileName,true);
        //default üstüne yazar ikinci parametre true verilirse sonuna yazar
        BufferedWriter writer = new BufferedWriter(fileWriter);
        //yeni satıra yazdırır
        writer.newLine();
        writer.write("deneme");
        writer.close();
    }
}
