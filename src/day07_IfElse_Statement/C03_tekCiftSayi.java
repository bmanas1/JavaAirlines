package day07_IfElse_Statement;

import java.util.Scanner;

public class C03_tekCiftSayi {
    public static void main(String[] args) {

        // soru 1 kulanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz ");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("girilen sayi cift sayidir");

        }
        if (sayi%2 !=0){
            System.out.println("girilen sayi tek sayi");
        }

        // normalde bir sayi ya tekdir ya ciftir, ucuncu bir durum yok
       // ozaman tek olmasi ve cift olmasini iki ayri if ile degil
        // if else ile tek statement da yapmak daha guzel olur
        //========= if else ile cozum=========
        if (sayi%2==0){
            System.out.println("girfdiginiz sayi cif sayidir");

        } else {
            System.out.println("girdiginiz sayi tek sayidir");
        }




    }



}
