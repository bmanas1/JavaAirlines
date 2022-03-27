package day22_Arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {

        // Verilen array de istenen bir elementin var olup olmadigini true/false yazdirarak
        // gosteren bir method olusturun
        int arr[]={3,5,6,1,9,25,45,9,0};

        int istenensayi=14; // bu sayi varmi yokmu

        istenenelemanVarmi(arr,istenensayi);


    }

    public static void istenenelemanVarmi(int[] arr, int istenensayi) {

        boolean sonuc=false;// buraya boolean yazip false yazarsak olur //asagisi true oldugu icin false
        for(int i=0;i<arr.length;i++) {

            if(arr[i]==istenensayi){
                sonuc=true;
                break;// bunu yazmaksak olmaz tekrar tekrara arar buna gerek yok
            }// buraya else yazsak hepsini tek tek karsilastirip yazar// cozum boolean yazmak basa
        }
        System.out.println(sonuc);

    }
}
