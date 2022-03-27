package day03_scanner;

public class C01_Variables {

    public static void main(String[] args) {

        // 1- farkli 3 data turunden variable olusturun ve bunlari yazdirin
        String okulIsmi="Yildiz Koleji";
        System.out.println(okulIsmi);
        char ilkharf;
        ilkharf='K';
        System.out.println(ilkharf);

        int sayi1=10, sayi2=20;
        System.out.println(sayi1+sayi2);

        // 2- isim ve soyisim icin iki variable olusturun ve bunlari
        // isminiz : Mehmet
        // soyisminiz : Bulutluoz
        // seklinde yazdirin

        String isim="Mehlika";
        String soyIsim="Altay";

        System.out.println("Isminiz: " + isim);
        System.out.println("soyisminiz :  " + soyIsim);

        // 3- iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
        short sayi3=20;
        double sayi4=30;
        System.out.println(sayi3 +sayi4); // 50.0 olur nicin .0 cunki double yaptik // aciklama eklemek istrsem ne olur
        System.out.println("iki sayi toplmami:" + sayi3 + sayi4); // burada sonuc ikisayinin toplami:2030 olur
        //toplamadi. // toplamasi icin parantez koymali sayilara
        System.out.println("iki sayi toplmami:" + (sayi3 + sayi4));


        // 4- bir tamsayi ve bir ondalik variable olusturun ve bunlarin toplamini yazdirin



        // 5- char data turunde bir variable olusturun ve yazdirin
        char ozelKarakter='#';
        System.out.println(ozelKarakter); // #

        // 6- bir tamsayi, bir de char degiskeni olusturun ve bunlarin toplamini yazdirin

        int sayi5=20;
        char harf='a';
        System.out.println(sayi5+harf); // 117 yazdi
        // char data turundeki degiskenler matematiksel islemlerde kullanilirsa
        // o char degerinin ascii karsiligi isleme alinir. bir tablo var tum dunyada ki matematiksel karsiligi
        // mesela tabloda kucuk a ascii kdeki karsiligi 97
        // toplayinca 117 cikiyor



    }
}
