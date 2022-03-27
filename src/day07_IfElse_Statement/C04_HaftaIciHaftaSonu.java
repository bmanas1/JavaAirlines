package day07_IfElse_Statement;

import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {
        // soru 3 Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // ornek gun=Pazar output = "Hafta Sonu"
        // gun=Sali output = "hafta ici"
        // *** String icin equals method unu kullanin

        // pazar veya pacumartesi ise ==> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici

        // String case sensitive dir
        // yani pazar,Pazar, PAZAR bunlar hep farkli kelime

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi = scan.next().toLowerCase(); // kullanici nasil yazarsa yazsin biz kucuk harfe ceviriyoruz

        // String ifadelerde == kulanilmasi tavsiye edilmez
        // cunki beklemedigimizden farkli sonuc verebilir

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("girdiginiz gun haftasonu");
        }

        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
                gunIsmi.equals("persembe") || gunIsmi.equals("cuma")) {
            System.out.println("girdiginiz gun haftaici");
        }

        }
    }
