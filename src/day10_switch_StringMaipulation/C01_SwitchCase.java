package day10_switch_StringMaipulation;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        // kullanicidan sayi olarak kacinci ay oldugunu alip
        // istenen ay ismini yazdiran bir program yaziniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz: ");
        int ayNo= scanner.nextInt();
        //bu soruyu if else ile yapabiliriz ama art arda 12 if else
        // cok fazla ve kalabalik olacagindan guc olabilir
        // bunun yerine switch case yapisini kullanabiliriz

        switch (ayNo){

            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasim");
                break;
            case 12:
                System.out.println("Aralik");
                break;
            default:
                System.out.println("lutfen gecerli bir ay numarasi giriniz");

                // switch icine yazilan variable lin degerine gore
                // ilgilie case i bulur ve break gorene kadar kodu calistirir
            // eger  break yoksa case den asagiya dogru tum caseler calisir
            // if else deki son else gibi geriye kalan tum durumlari tamamen
            // kapsayacak bir sattir daha ekleyeviliriz default






        }





    }
}
