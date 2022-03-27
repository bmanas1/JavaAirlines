package day07_IfElse_Statement;

import java.util.Scanner;

public class C07_Haftain_gunleri_IfElseIf {
    public static void main(String[] args) {

        // soru 3 Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // Eger kullanici gun ismini yanli girerse yanlis yazdirin
        // ornek gun=Pazar output = "Hafta Sonu"
        // gun=Sali output = "hafta ici"
        // *** String icin equals method unu kullanin

        // pazar veya pacumartesi ise ==> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi= scan.next().toLowerCase();

        // bu tur durumlarda hata yapma ihtimli cok yuksek
        // o yuzden yapyi olustuurn oncelikle

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("girdiginiz gun haftasonu");

        }else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
                gunIsmi.equals("persembe") || gunIsmi.equals("cuma")){
            System.out.println("girdiginiz gun haftaici");

        } else{
            System.out.println("Lutfen gecerli bir gun giriniz");
            // eger if else if ..... statement else ile bitiyorsa
            // olasiklardan sadece biri mutlaka calisir
            // Java ilk buldugu true a ait sonucu yazdirir
            // ve kalan sartlara bakmaz

            // if else if .... statement else ile bitiyorsa
            // olasiliklardan sadece bir tanesi mutlaka calisir
        }




    }
}
