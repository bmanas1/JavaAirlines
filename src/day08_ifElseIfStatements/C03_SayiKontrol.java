package day08_ifElseIfStatements;

import java.util.Scanner;

public class C03_SayiKontrol {
    public static void main(String[] args) {
        // kulanicidan iki sayi siteyin sayilardan ikiside pozitif ise toplamini yazdirin
        // sayilardan ikisi de negatif ise sayilarin carpimini yazdirin
        // sayilarin ikisi farkli isaretlere sahipse
        //farkli isaretlerde sayilarla islem yapamasin yazdirin
        // sayilardan sifira esit olan varsa sifir carpmaya gore yutan elemandir yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");


        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        // sayilardan ikisi de negatif ise sayilarin carpimini yazdirin

        if (sayi1>0 && sayi2>0){
            System.out.println("Girdiginiz sayilar pozitif oldugu icin toplamlari= " +
                    (sayi1 + sayi2));

        }else if(sayi1<0 && sayi2<0){
            //sayilardan ikisi de negatif ise sayilarin carpimini yazdirin
            System.out.println("Girdiginiz iki sayi da negatif oldugundan carpimlari= " +
                    (sayi1*sayi2));
            // sayilarin ikisi farkli isaretlere sahipse/
            // bunu nasil kontrol ederiz. sayi1<0 yada sayi1>0 olabilir sayi2<0 yada sayi>0 olablir
            // bu sekilde yazabiliriz yada daha kisa sayi1*sayi2<0 dersek de olur
        } else if (sayi1*sayi2<0){
            // sayilarin ikiside farkli isaretlere sahipse
            //"farkli isaretlerde sayilarla islem yapamasin" yazdirin

            System.out.println("Farkli isaretlerde sayilarla islem yapamasin");

        }else {
            System.out.println("Sifir carpmaya gore yutan elemandir");
        }


    }
}
