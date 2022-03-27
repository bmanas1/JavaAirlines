package day10_switch_StringMaipulation;

import java.util.Scanner;

public class C02_switch_Mevsimler {
    public static void main(String[] args) {
        // kulanicidan kacinci ay oldugunu alip
        // mevsimi yazdiran bir kod yaziniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz: ");
        int ayNo= scanner.nextInt();
        switch (ayNo){

            case 12:
              //  System.out.println("Aralik Kis"); // burada uc defa kis yapiliyor bu tur tekrarlarda
                // yazdirmalar siliniz
              //  break;
            case 1:
                //System.out.println("Ocak Kis"); sildik
               // break;
            case 2:
                System.out.println("Kis");
                break;
            case 3:
              //  System.out.println("Mar ilkbahar"); sil
              //  break;
            case 4:
              //  System.out.println("Nisan ilkbahar"); sil
              //  break;
            case 5:
                System.out.println("ilkbahar");
                break;
            case 6:
              //  System.out.println("Haziran Yaz"); sil
              //  break;
            case 7:
              //  System.out.println("Temmuz Yaz"); sil
              //  break;
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
              //  System.out.println("Eylul Sonbahar");
              //  break;
            case 10:
              //  System.out.println("Ekim Sonbahar");
               // break;
            case 11:
                System.out.println("Sonbahar");
                break;

            default:
                System.out.println("lutfen gecerli bir ay numarasi giriniz");

        }




        }

}
