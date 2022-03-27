package day22_Arrays;

import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {
        // verilen bir array de en kucuk ve en buyuk degerleri yazdirin

        int arr[]={3,5,6,1,9,0,25,45,9,0};

        //sort method olmadan yapalim

        int enkucuksayi = Integer.MAX_VALUE; // arr[0]
        int enbuyuksayi = Integer.MIN_VALUE; // arr[0]


        for (int i = 0; i < arr.length; i++) {

            if (arr[i]<enkucuksayi){

                enkucuksayi=arr[i];

            }
            if (arr[i]>enbuyuksayi){
                enbuyuksayi=arr[i];
            }

        }
        System.out.println("Array deki en kucuk sayi : " + enkucuksayi);
        System.out.println("Array deki en kucuk sayi : " + enbuyuksayi);


        // sort ile yapim

        Arrays.sort(arr);
        System.out.println("Array deki en kucuk sayi : " + arr[0]);
        System.out.println("Array deki en kucuk sayi : " + arr[arr.length-1]);


    }
}
