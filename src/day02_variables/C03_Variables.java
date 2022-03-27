package day02_variables;

public class C03_Variables {
    public static void main(String[] args) {

      String ogrenciIsmi="melih";

      ogrenciIsmi="Furkan";
      //bir variable declare edildiktensonra istedigimiz kadar deger degisimi yapilabilir
        //ancak declare edilen bir variable tekrar declare edilemez
        // String ogrenciIsmi="abdullah"; olmaz

       String isim,soyisim,dogumYeri;


       isim="Nihan";
       soyisim="Altay";
       dogumYeri="Sivas";
        //isim="Nihan", soyisim="Altay", dogumYeri="Sivas"; bu sekidede olabilir


       // String isim="Nihan"; soyisim="Altay"; dogumYeri="Sivas";


       System.out.println(dogumYeri);
       System.out.println(isim);
       System.out.println(soyisim);

       String tcNo="12345667890009988777";
       String hiclik="";

        // string non-primitive oldugu icin biz sadece data saklamak degil
        // ekstra bazi ozellikleri de kullanabiliriz
        // eger tc no okul numarasi veya tel numarasi gibi
        //kendisi sayisal olan ancak matematiksel bir islemde kullanimayan sayilardada kullanabilirsiniz

       String harf= "A";
       //char harf2='A';
        //bu ikisi icinde ayni durum gecerli
        // ben A harfii bir variable i char ilarak da olusturabilirim string olarakda olusturabilirim
        // String in ozelliklerinden istifade etmek icin String olarak tanimlamak daha avantajli




    }
}
