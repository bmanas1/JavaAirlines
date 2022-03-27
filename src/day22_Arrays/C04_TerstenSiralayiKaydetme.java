package day22_Arrays;

import java.util.Arrays;

public class C04_TerstenSiralayiKaydetme {
    public static void main(String[] args) {

        int arr[] = {3, 5, 6, 1, 9, 25, 45, 9, 0};

        arr = terstenSirala(arr);
        System.out.println(Arrays.toString(arr)); //[45, 25, 9, 9, 6, 5, 3, 1, 0]
        System.out.println("En buyuk Element : "+ arr[0]);

    }

    public static int[] terstenSirala(int[] arr) {

        Arrays.sort(arr); // [0, 1, 3, 5, 6, 9, 9, 25, 45]
        //bir bos array olusturarak oraya aktaririz
        int tersArr[] = new int[arr.length]; //[0, 0, 0, 0, 0, 0, 0, 0, 0]


        for (int i = 0; i < arr.length; i++) {

            tersArr[i] = arr[arr.length - 1 - i];

        }
        return tersArr;
    }
}
