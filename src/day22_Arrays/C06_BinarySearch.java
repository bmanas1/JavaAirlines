package day22_Arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {

        int arr[]={3,5,6,1,9,25,45,9,0};
        int istenensayi=35;

        // eger javadan hazir BinarySearch ilee yapmak isterseniz
        //once methodu kullanip sonra binarySearch yapmaliyiz
        //binarySearch() bize istenen sayinin oldugu index i verir.
        // bir elementin var olup olmadigini bulmak icin hazir binarySearch methodu kullanilir
        // binarySearch yapmak icinde sort yapmak mecburi


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));// [0, 1, 3, 5, 6, 9, 9, 25, 45]
        System.out.println(Arrays.binarySearch(arr,istenensayi));//index i 2

        // eger olmayan birelement aratir isek
        //Java bulamadigini gostermek icin -isareti koyar
        // sonrada o sayi olsaydi siralamasi ne olacak ise o siralayi bize verir
        // java -0 kullanmaz -1 den baslar

        // olan sayilar index doner yani 0 1 2 3  diye gider
        // olmayanlar ise -(sira) gider yani -1 -2 -3





    }
}
