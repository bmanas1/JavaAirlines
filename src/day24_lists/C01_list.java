package day24_lists;

import day23_MultiDmensionalArrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_list {
    public static void main(String[] args) {

        int arr[]={};
        // bu array e 5 ekleyelim
        // buraya ekleme icin bir method kullanilmali
        // bu methodu daha onceki derste C06 da olusturmustuk
        // C06 daki methoda ulasmak icin objek olsuturmaliyiz

        arr=C06_Arrays.arrayeElemanekle(arr,5);
        System.out.println(Arrays.toString(arr));// [5]

        // bir de 3 ekleyelim
        arr=C06_Arrays.arrayeElemanekle(arr,3);
        System.out.println(Arrays.toString(arr));// [] [5, 3]

        // javada aynisini yapmis
        // Array list olustumak icin
        // ArrayList<String>list1=new ArrayList<String>()
        // ArrayList<String>list1=new ArrayList<>()
        //List<String>list1=new ArrayList<>() en cok bunu kullanacagiz
        // yazdirmak cok kolay System.out.println(list1);
        // zor olan kismi eklemek  add()

        //bir list olusturalim
        List<Integer> sayilarlist = new ArrayList<>();
        System.out.println(sayilarlist); //[] // bos bir list olusturuldu
        // bir element ekleyelim
        sayilarlist.add(5); //[5]
        sayilarlist.add(3);//[5,3]
        sayilarlist.add(0,7);// burada 9 inci yere 7 ekler basa yani [7,5,3]
        sayilarlist.add(2,7); //[7, 5, 7, 3]

        System.out.println(sayilarlist);






    }
}
