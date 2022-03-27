package day23_MultiDmensionalArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //verilen bir array e yeni bir element ekleyn bir method olusturun

        int arr[] = {3, 5, 7};

        // arr[3]=8; // bunu yapamayiz hata verir

        // arrayde olmaya bir index e atama yapamayiz

        //arr={1,3,5}; // var olan bir array e ayni boyutta bile olsa
        // direk yeni degerler iceren bir array atayamayiz
        arr=new int[4]; // [0, 0, 0, 0] // bu sekilde olur eski array olduruldu yeni bir array atandi
        System.out.println(Arrays.toString(arr));

        int arrYeni[]=new int[5];
        arr=arrYeni;
        System.out.println(Arrays.toString(arr));
        arrYeni[0]=2;
        arrYeni[3]=5;
        System.out.println(Arrays.toString(arr));

        // bir array e icnde hazir elementlerin oldugu yeni bir array atama kistersek
        // bini {1,2,3} seklinde yazarak degil
        // new int[3] diyerek olusturp sonra deger atamasi yaparak bir arrayi
        //assign ederek yapilir

        int arrEnYeni[]={1,2,3,4,5};
        arr=arrEnYeni;

        System.out.println(Arrays.toString(arr));

    }
}
