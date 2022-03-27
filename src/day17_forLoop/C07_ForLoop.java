package day17_forLoop;

public class C07_ForLoop {
    public static void main(String[] args) {
        //Soru 6) Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin.
        // 1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
        // - Sayi 3’un kati ise sayi yerine “Java” yazdirin.
        // - Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
        // - Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.
        //murat çebi  3:54 PM

        int sayi=60;
        // bagimsiz if mi bagimli if mi bakmali bagimsiz olursa 1 sayi icin 3 farkli sonuc alirim
        // o yuzden bagimli if olmali

        for (int i = 0; i <=sayi ; i++) {

            if (i%3==0 && i%5==0) {
                System.out.println("Java Guzeldir ");
            }else if (i%3 == 0) {
                System.out.println(" Java");
            }else if (i%5==0 ){
                System.out.println("Guzeldir");
            }else {
                System.out.println(i+" ");
            }


        }

        /*Scanner scan = new Scanner(System.in);
        System.out.print("100'den küçük sayı gir: ");
        int sayi = scan.nextInt();
        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " Java Guzeldir");
            } else if (i % 3 == 0) {
                System.out.println(i + " Java");
            } else if (i % 5 == 0) {
                System.out.println(i + " Guzeldir");
            }
        }

         */




    }
}
