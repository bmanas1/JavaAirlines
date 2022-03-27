package day03_scanner;

public class C03_Swapvariation_temp_olmadan {
    public static void main(String[] args) {
         /* 1- verlen sayi1 ve sayi2 variable larinin degerlerini degistiren (SWAP) bir program yaziniz temp olmadan
       ornegin sayi1=10 sayi2=20
       kod calistiktan sonra
       sayi1=20 sayi2=10
       */

        int sayi1=10;
        int sayi2=20;

        System.out.println("Swapdan once sayi1: " + sayi1 + ", sayi2: " +sayi2);
        // nasil bir islem ile yer degistirebilirim


        sayi1=sayi1 + sayi2;

        sayi2=sayi1 - sayi2;

        sayi1=sayi1 - sayi2;

        System.out.println("Swapdan sonra sayi1: " + sayi1 + ", sayi2: " +sayi2);

    }
}
