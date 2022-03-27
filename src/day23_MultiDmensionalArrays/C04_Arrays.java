package day23_MultiDmensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {
        // Kullaniciya kac elementlik bir array olusturacagini sorun
        // arrayi olusturup elementleri kullanicidan alip arraya atayin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kac elementli bir array istediginizi yaziniz: ");

        int uzunluk= scanner.nextInt(); //5

        int arr[]=new int[uzunluk]; // [0,0,0,0,0]

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Array icin "+ (i+1)+ " . elemani giriniz ");
            arr[i]=scanner.nextInt();

        }

        System.out.println(Arrays.toString(arr));
    }
}
