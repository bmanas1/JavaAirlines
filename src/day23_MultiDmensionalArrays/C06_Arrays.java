package day23_MultiDmensionalArrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        //verilen bir array e yeni bir element ekleyn bir method olusturun

        int arr[] = {3, 5, 7,2,4};
        int eklenecekElement=8;

        // method olusturacagim
        // ben sadece method olusturmakla yetinmeyecegim yeni halini de atama yapmaliyim
        // arr= demeliyim
        arr=arrayeElemanekle(arr,eklenecekElement);
        arr=arrayeElemanekle(arr,11);// ikinci array eklemek icin
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayeElemanekle(int[] arr, int eklenecekElement) {

        // bir bos container olmali ki eskiyi ona yukleyeyim
        int yeniArray[]=new int[arr.length+1]; // yeni containr in uzunlugu eski sinin uzunlugu +1 olmali
        // yeni arrayin durumu [0,0,0,0]

        for (int i = 0; i < arr.length; i++) {
            yeniArray[i]=arr[i];
            // cikarma da yapilabilir


        }
        yeniArray[yeniArray.length-1]=eklenecekElement;
        // yeniArray[arr.length]=eklenecekElement; bu sekildede calisir

        return yeniArray;

    }
}
