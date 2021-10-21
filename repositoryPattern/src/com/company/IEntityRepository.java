package com.company;

public interface IEntityRepository<T extends IEntity> {

    //Tasarım deseni
    //belli standart çözümlerini gerçekleştirmek adına kodlama standartları
    //Repository Design Pattern

    //Veritabanı işlemleri için kullanılır
    //Örn: ekleme,güncelleme, silme, görüntüleme işlemleri benzerdir.
    //Degişken olan tek şey istenilen nesnelerdir (tablolar). (Customer, Product)

    //Temel olarak bir Repository Interface bulunur. Burada generic yapı kullanılarak farklı nesneler ile
    //çalışabilmeyi sağlıyor

    //entity genellikle veritabanı nesnesi anlamına gelir
    // T degerini sınırlamak generic constraints generik kısıt
    //Örn veritabanıyla alakasız herhangi bir class oldugunu varsayalım
    //Bu classın bu Interface'yi implement etmemesi gerekiyor çünkü bu kısımda işi yok
    //Bu kısımda IEntity adında bir interface açtıgımızı varsaylım bu interface gruplamamıza yardımcı olacaktır.
    //Interface implement kabul etmiyor hata veriyor extends yapılması gerekiyor Java ile alakalı bir durum olabilir

    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
