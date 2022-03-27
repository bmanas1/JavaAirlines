package day08_ifElseIfStatements;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {
    public static void main(String[] args) {
        // soru 7 kullanici dan 100 uzerinden
        // notunu isteyin Notu harf sistemine cevirip yazdirin
        // 50 den kucukse "D"
        // =50- <60 arasi "C"
        //=60- <80 arasi "B"
        // =80 nin uzerinde ise "A"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Notunuzu Giriniz");


        double notSayi=scanner.nextDouble();
        if (notSayi<0 || notSayi>100){
            System.out.println("Lutfen gecerli bir not giriniz");
        }

        /*else if (notSayi<50){
            System.out.println("Notunuz D");
        } else if (notSayi>=50 && notSayi<60) {
            System.out.println("Notunuz C");
        } else if (notSayi>=60 && notSayi<80){
            System.out.println("Notunuz B");
        } else {
            System.out.println("Notunuz A");
        }
        */
         // yukaridaki calisan ve biraz uzun olan kisimlar var
        // bu formulde negatiff veya 5o den yuzden buyuk sayilari henuz eklemedik.
        // asagidaki formul kisaltilmis sekli
        else if (notSayi<50){
            System.out.println("Notunuz D");
        } else if ( notSayi<60) {
            System.out.println("Notunuz C");
        } else if (notSayi<80){
            System.out.println("Notunuz B");
        } else {
            System.out.println("Notunuz A");
        }





    }
}
