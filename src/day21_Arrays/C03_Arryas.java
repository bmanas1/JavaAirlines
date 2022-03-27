package day21_Arrays;

import java.util.Arrays;

public class C03_Arryas {
    public static void main(String[] args) {

        int arr[];// deger atamasi yapmadik ama java kabul etti
        // bunu yazdirirmi?

        // System.out.println(Arrays.toString(arr));// java kullanmamiza izin vermedi

        // arrayin tamaminin default u yok ama icindeki elementlerin olur


        arr=new int[6];
        System.out.println(Arrays.toString(arr));// [0 0 0 0 0 0]

        System.out.println(arr.length); // 6 // String dekind () vardi bunda yok



        // array deki her bir elemani index degeri kadar artiralim
        // elle tek tek yapmk makul degil
        // bir loo olusturmali
        for (int i = 0; i < arr.length; i++) {
            arr[i] +=i;

        }
        System.out.println(Arrays.toString(arr));

        // son indexteki elementi yadiralim

        System.out.println(arr[arr.length - 1]);// 5

    }
}
