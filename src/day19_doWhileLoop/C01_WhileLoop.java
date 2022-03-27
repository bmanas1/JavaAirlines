package day19_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan bir sayi alalim
        // bu sayiyi tam bolen sayilari ve toplam kactane olduklarini yazdiriniz

        int input=20;
        // bunun icin for loop yada while loop yapilabilir
        // biz simdi while loop ile yapalim
        int bolen=1;
        int sayac=0;

        while (bolen <= input) {
            if (input% bolen==0){
                System.out.print( bolen + " ");
                sayac++;
            }
            bolen++;

        }
        System.out.println("");
        System.out.println(input + " sayisini bolen " + sayac + " adet sayi vardir");


    }
}
