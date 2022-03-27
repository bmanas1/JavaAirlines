package day07_IfElse_Statement;

import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {
    public static void main(String[] args) {

        // soru 3 Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // ornek gun=Pazar output = "Hafta Sonu"
        // gun=Sali output = "hafta ici"
        // *** String icin equals method unu kullanin

        // pazar veya pacumartesi ise ==> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi= scan.next().toUpperCase();

        // if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
        // System.out.println("girdiginiz gun haftasonu"); // birsonuc cikmaz neden biz buyuk harfe cevirdik


            if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESI")){
                System.out.println("girdiginiz gun haftasonu");

            } else {
                System.out.println("Girdiginiz gun haftaici"); // haftasonu degilise diger gunler hafta icidir
            }

    }
}
