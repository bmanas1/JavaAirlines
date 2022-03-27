package day18_nesteForLoop;

public class C06WhileLoop {
    public static void main(String[] args) {
        // kullanicidan iki tam sayi alip
        // bu sayilari ve aralarindaki tum tamsayilari yazdiran bir code olustur

        // for loop ile yapilabilir normalde

        int baslangic=40;
        int bitis = 60;

        for (int i = baslangic; i <=bitis ; i++) {
            System.out.print(i+" ");

        }

        System.out.println("");

        // ayni soru whli loo ile

        while (baslangic<=bitis){

            System.out.print(baslangic + " ");
            baslangic++;
        }
        System.out.print(baslangic); // burada yazdirsam 61 yazdirir kullanici baslangic degeri degisti
        // cozum ise bir i sayisi atayarak i = baslangic diyelim

        int i=baslangic;

        while (i<=bitis){

            System.out.print(i + " ");
            i++;
        }
        System.out.print(baslangic);

    }
}
