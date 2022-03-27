package day22_Arrays;

import java.util.Arrays;

public class C03_BuyuktenKucugeSiralama {

    public static void main(String[] args) {
        // verilen bir arrayi buyukten kucuge siralayip yazdiran bir method olusturun

        int arr[]={3,5,6,1,9,25,45,9,0};
        //once bir theod olusturmali
        terstenSiralaazdir(arr);
    }

    public static void terstenSiralaazdir(int[] arr) {

        // once siralamaliyiz
        Arrays.sort(arr); // [0, 1, 3, 5, 6, 9, 9, 25, 45]
        //bir bos array olusturarak oraya aktaririz
        int tersArr[]=new int[arr.length]; //[0, 0, 0, 0, 0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(tersArr));

        for (int i = 0; i < arr.length; i++) {

            tersArr[i]=arr[arr.length-1-i];

        }
        System.out.println(Arrays.toString(tersArr)); //[45, 25, 9, 9, 6, 5, 3, 1, 0]

    }

}
