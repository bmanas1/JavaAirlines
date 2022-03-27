package day03_scanner;

public class C02_swapVarialble_den1 {

    public static void main(String[] args) {

         /* 1- verlen sayi1 ve sayi2 variable larinin degerlerini degistiren (SWAP) bir program yaziniz
       ornegin sayi1=10 sayi2=20
       kod calistiktan sonra
       sayi1=20 sayi2=10
       */
        int sayi1= 5;
        int sayi2=666;
        System.out.println("degisimden onceki girilen sayilar");
        System.out.println("sayi1: " + sayi1);
        System.out.println("sayi2: " + sayi2 );

        int temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;

        System.out.println("degisimden saonraki sayilar");
        System.out.println("sayi1: " + sayi1);
        System.out.println("sayi2: " + sayi2 );



    }
}
