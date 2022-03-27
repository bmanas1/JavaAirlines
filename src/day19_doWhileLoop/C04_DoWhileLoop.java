package day19_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        //Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        // Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve
        // “Negatif sayi giremezsiniz” yazdirip basa donun
        // Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        // yanlislikla kac negative sayi girdigini ve
        // girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        // sayiyi tekrar tekrar istedigim icin do while kullan
        int sayi=1; // burada ister 1000 yada 1 fark etmez kulanicidan aliyoruz. deger atamazsak calismaz
        int toplam=0;
        int sayacPositif=0;
        int sayacNegatif=0;
        do {
            System.out.println("Lutfen Positif bir sayi girin\nBitirmek icin 0 a basin");
            sayi=scan.nextInt();
            if (sayi<0){
                System.out.println("Negatif sayi giremezsini");
                sayacNegatif++;
                }else if(sayi>0){
             toplam+=sayi;
             sayacPositif++;
            }
        } while (sayi !=0);
        System.out.println("Yanlislikla griilen negatif sayi adedi: " + sayacNegatif);
        System.out.println("Girieln Positif sayi adedi: " + sayacPositif);
        System.out.println("Girilen positif sayilarin toplami: " + toplam);
    }
}
