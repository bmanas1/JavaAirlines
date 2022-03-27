package day19_doWhileLoop;

public class C03_DowhileLoop {
    public static void main(String[] args) {
        // code stratejinizz  ile ilgili
        // kullanicidan bir tam sayi alarak
        // while loop ile 5 ten kucuk positif tam sayilari yazdiralim
        int input=3;

        int sayi=1;
        int sayac=1;

        while(sayi<input){
            System.out.println(sayi);
            sayac++;
            sayi++;
            // yukarida 3 kontrol 2 sayi yapti
        }

        // ayni soru yu do While loop ile yapaim
        sayi=1;
        do {
            System.out.println(sayi);
            sayi++;
        } while(sayi<input);

        // burada 2 kontrol iki sayi yazdi


    }


}

