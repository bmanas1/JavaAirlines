package Day04_dataCastingIncrement;

public class C03_Casting {
    public static void main(String[] args) {

        int sayi1=8;

        int sayi2=4;

        System.out.println(sayi1/sayi2); // sonuc 2

        sayi2=3;
        System.out.println(sayi1/sayi2);
        System.out.println(sayi1/sayi2); // normalde 2.666666 olmali // ama calistinca sonuc 2 cikiyor

        // mesela

        sayi1=22;

        System.out.println(sayi1/sayi2);// sonuc 7.33333 olmali idi ama 7 vermekte neden

        // java iki integer sayiyi birbirine boler ise sonucu da integer olarak veir
        // eger virgulden sonra kusurat var ise siler

        sayi1=4786;
        sayi2=10;
        sayi1=sayi1/sayi2;// 478.6

        System.out.println(sayi1); // sonuc 476 olur kusurattan kurtulmus olursunuz

        sayi1=sayi1/sayi2;
        System.out.println(sayi1); // 47


        sayi1=sayi1/sayi2;
        System.out.println(sayi1); // 4

        sayi1=sayi1/sayi2;
        System.out.println(sayi1); // 0

        sayi1=4895;
        double sayi3=10;
       //  sayi1=sayi1/sayi3; // iki farkli sayi data turunu isleme koydugumuzda
                          // Java kucuk olan data turu icin autowidening yapar
                          // BU islemi dusunursek sayi1/sayi3 = isleminm sonucunu double kabul eder
                         // ama bu islemi yazdiramayiz o yuzden yorum seklinde olur
        // burada atamayi yapamiyor yazdira bilir.


        System.out.println(sayi1/sayi3); // 489.5




    }
}
