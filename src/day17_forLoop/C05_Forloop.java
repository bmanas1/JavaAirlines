package day17_forLoop;

public class C05_Forloop {
    public static void main(String[] args) {
       // Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin.
        // 1’den baslayarak girilen sayiya kadar 3’un kati olan sayilari yazdirin.

        int sayi=55;
        for (int i = 1; i <=sayi ; i++) {
            //1den  55 e kadar devam eder ama her sayi yazilmayacak if e ve modules a ihtiayv var
            if (i%3==0){
                System.out.print(i + " ");
            };

        }


    }
}
