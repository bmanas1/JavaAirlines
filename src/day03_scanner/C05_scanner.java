package day03_scanner;

import java.util.Scanner;

public class C05_scanner {
    public static void main(String[] args) {
        // saru 3 Kullanicidan yari cap isteyip
        // cemberin cevresini ve dairenin alanini hesaplayip yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen cemberin yari capini giriniz");
        double yaricap= scan.nextDouble();

        System.out.println("Girdiginiz yaricap:" + yaricap);
        System.out.println("cemberin cevresi: " + 2*3.14*yaricap);
        System.out.println("dairernin alani: " + 3.14*yaricap*yaricap);


    }
}
