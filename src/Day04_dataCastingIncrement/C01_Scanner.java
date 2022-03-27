package Day04_dataCastingIncrement;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        // 7. kullanicidan ismini alin ve bas harfini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Isminizi Giriniz...");
        char ilkharf=scan. next().charAt(0);
        // nextchar olamadigi icin bu formul kullanilir
        //,charAt(indext) methodu parametre olarak yazdigimiz index deki char i bize getirir.
        // string de index sifirdan baslar o yuzden .charAt(0) dir mesela E r s i n ise E 0, r 1, s,2, i 3, n 4 tur

        System.out.println("girdginiz ismin ilk harfi: " +ilkharf);


    }
}
