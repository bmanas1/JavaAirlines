package day09_ternary_Switch;

import java.util.Scanner;

public class C01a_NestedIfElseBeseBolunme {
    public static void main(String[] args) {
        // kullanicidan 4 basamakli bir sayi girmesini isteyin
        // Girdigi sayi5 e bolunuyorsa son rakamini kontrol edin.
        // son rakami 0 ise ekrana 5 e bolunen cift sayi yazdirin
        // son rakami 0 degil ise 5 e bolunen tek sayi yazdirin
        // girdigi sayi 5 e bolunmuyorsa ekrana tekrar deneyin yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli positif bir tamsayi giriniz");
        int sayi=scan.nextInt();

        if (sayi<1000 || sayi>9999){ // isenmeyen durumu yaziyoruz

            System.out.println("Lutfenaa 4 basamakli positif bir tamsayi giriniz");

        } else if (sayi%5==0){ // sayi 5 e tam bolunur
            System.out.println("5 e bolunen cift sayi"); // geriye 5 ile bolune bilenleri
            // tek cift olarak ayirmami istiyor

            if (sayi%10==0){ // 4 basamakli 5 e bolunebilen son rakami 0
                System.out.println("5 e bolunen cift sayi");

            } else{ //4 basamakli 5 ile bolune bilinen ve son rakami 0 olamayan
                System.out.println("5 e bolunen tek sayi");
            }



        }else { // 4 bsamakli ve 5 e bolunemeyen
            System.out.println("Tekrar deneyin");

        }

    }
}
