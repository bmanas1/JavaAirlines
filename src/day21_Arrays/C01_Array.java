package day21_Arrays;

public class C01_Array {
    public static void main(String[] args) {
        // array i nasil declere ederiz
        // data turu arrayin ismi kosei parantez yazarak declare ederiz


        int arr1[]={1,3,5};
        int[] arr2={2,3,5};
        int[] arr3={1,4,5};

        double[] arr4={10,2,20.1,1.5};

        String arr5[]={"Ali","Veli","Ayse"};

        // assign sartmi?
        int sayi; // array siz oluyordu
        int arr6[]; // kabul etti ama kullanamayiz.

        // kullanmadan once mutlaka deger atamasi yapmaliyiz

        // hem declare edip hem deger atamasi nasil yapili
         // - 1- declare edip esitligin sagina suslu parantez icerisine degerleri yazabilirz
        // -2 - icine deger atamadan olusturmak isterseniz boyutunu belirlemek gerekir
        String arr7[]={"Ali","Veli","Ayse"};


        int arr8[]=new int[5]; // burada boyut soylemeli mesela 5 desek
        // java icine 5 tane default deger olan bir array olusturur
        // [0,0,0,0,0]


    }
}
