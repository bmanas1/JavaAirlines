package day20_scope_Array;

public class C02_StaticVaraibles {

    /*instance variable lar obje ye bagimlidir ve her obje farkli degerle alabilir
      ogrenci notlari veya ogretmen branslari gibi
      bir objeye ait variable in son degerini bulmak icin sadece o obje yi dikkate aliriz

      Static variable lar ise Class veriable li olrak tanimlanir ve
      tum class uyleri icn geceridir. okul muduru okul adi gibi
      eger static variable in degeri degisirse herkes icin degisir

     */


    static String okulIsmi="Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;


    public static void main(String[] args) {

        System.out.println(okulIsmi); // Yildiz Koleji// hic itiraz etmeden kullanabiliyoruz // cunki ikiside static
        System.out.println(okulNo); // 0
        okulNo=102;
        System.out.println(okulNo);// 102
        System.out.println(okulAcikMi); // false

        staticMethod(); // method call

        System.out.println(okulNo);


    }
    public static void staticMethod(){
        okulNo=200;
        System.out.println(okulNo);//200 // bunu ekranda goremem cagirmadim cunki
        //calismasi icin mainmethod icinde adini yazmamiz yeterli
    }

}
