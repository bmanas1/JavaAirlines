package day11_stringManuplation;

import java.util.Scanner;

public class C03_equalsIgnoreCase {

    public static void main(String[] args) {

        //kullaniciya derse katilim katilmak istemedigini sorun
        // evet derse cevabini ve derse katilimistir  yazdirin
        // hayir  derse cevabini ve sonraki derslerimize bekleriz yazdirin


       Scanner scan= new Scanner(System.in);
        System.out.println("Derse  katilmak istermisiniz ?\nEvetveya Hayir yaziniz");
        String cevap= scan.next();
        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz: " + cevap + " derse katiliminiz onaylanmistir");
        } else if (cevap.equalsIgnoreCase("hayir")) {
            System.out.println("cevabiniz : " + cevap + " Sonraki derslerimize bekleriz");
        } else {
            System.out.println(" lutfen evet veya hayir yaziniz");
        }
    }
}
