package day03_scanner;

public class C02_swapVariable_den2tempsiz {
    public static void main(String[] args) {

         /* 1- verlen sayi1 ve sayi2 variable larinin degerlerini degistiren (SWAP)tempsiz  bir program yaziniz
       ornegin sayi1=10 sayi2=20
       kod calistiktan sonra
       sayi1=20 sayi2=10
       */
        int sayi1=10;
        int sayi2=20;
        System.out.println("degisimden onceki girilen sayilar");
        System.out.println("sayi1: " + sayi1);
        System.out.println("sayi2: " + sayi2 );

        sayi1=sayi1 + sayi2;  // sayi1=30 olmustur artik
        // burada sayi larin toplami alinir ve bir variable atanir
        // bu toplmdan sayilari cikarirsak sayi1 ve say2 bulunur

        sayi2=sayi1 - sayi2; // sayi2 yi bulmak icin toplam olan sayi1(30) den cikaririz

        sayi1=sayi1 - sayi2; // teksar sayi1 i bulmak icin toplam olan sayi1 den sayi2 yi cikaririz

        System.out.println("degisimden sonra ki sayilar");
        System.out.println("sayi1: " + sayi1);
        System.out.println("sayi2: " + sayi2 );


    }
}
