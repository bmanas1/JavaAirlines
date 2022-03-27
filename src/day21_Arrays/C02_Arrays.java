package day21_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String arr1[]={"Ali","veli","Ayse"};
        // array icindeki elementlere ulasmak icin index kullaniriz

        System.out.println(arr1[0]);// Ali

        arr1[1]="esiLA";
        System.out.println(arr1[1]);//esila
        // arrayin icindeki index kullanarak elementlere ulasabilir ve update edebilirsiniz

        int arr2[]=new int[4];
        System.out.println(arr2[1]);//0
        System.out.println(arr2[3]);//0
        //System.out.println(arr2[5]);// hata verir

        // arrayin tamamini yazdirmak istersek
        System.out.println(arr2);// [I@e9e54c2 bu cikiyor/ bu bir referans
                                // array ler non primitive olduklarindan direk yazdimak istersek
                                // java referans bilgisini yazdirir

        // bir arkadas for loo yapalim dedi bakalim
        for (int i = 0; i < 4; i++) {

            System.out.print(arr2[i] + " ");// herseferinde forloop zahmetli
            System.out.println(" ");
        }

            // arrayi yazdirmak isin Arrays clasindan toString method kullaniriz

            System.out.println(Arrays.toString(arr2)); // [0 0 0 0]

            arr2[1]=11;
            arr2[3]=22;
        System.out.println(Arrays.toString(arr2)); //[0, 11, 0, 22]
        System.out.println(Arrays.toString(arr1)); // [Ali, esiLA, Ayse]

        }


    }

