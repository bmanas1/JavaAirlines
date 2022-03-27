package day03_scanner;

public class C02_swapVariable {
    public static void main(String[] args) {
      /* 1- verlen sayi1 ve sayi2 variable larinin degerlerini degistiren (SWAP) bir program yaziniz
       ornegin sayi1=10 sayi2=20
       kod calistiktan sonra
       sayi1=20 sayi2=10
       */

        int sayi1=10;
        int sayi2=20;

        System.out.println("Swapdan once sayi1: " + sayi1 + ", sayi2: " +sayi2);
          // nasil bir islem ile yer e=degistirebilirim
        //1. adim bos bir variable olusturup sayi1 oraya aktaracagiz. once temp ekleyecegiz

        int temp=sayi1;
        // 2. adim say1 e yeni degerini atamaliyiz
        sayi1=sayi2;
        // 3. adim sayi2 ye tempte olan sayidegerini atayalim
        sayi2=temp;

        System.out.println("Swapdan sonra sayi1: " + sayi1 + ", sayi2: " +sayi2);





    }
}
