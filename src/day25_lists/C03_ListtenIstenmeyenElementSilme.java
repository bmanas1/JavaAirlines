package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_ListtenIstenmeyenElementSilme {
    public static void main(String[] args) {

        // verilen  bir array den istenen elementi ( kactane varsa) silip kalanlari
        // yeni bir array de yazdiran bir method olusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=3;
        istenmeyenElementSilmeveYAzdir(arr,istenmeyenEleman);

    }

    public static void istenmeyenElementSilmeveYAzdir(int[] arr, int istenmeyenEleman) {
        List<Integer> yeniListe= new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=istenmeyenEleman){
                yeniListe.add(arr[i]);

            }


        }
        System.out.println(yeniListe);


    }
}
