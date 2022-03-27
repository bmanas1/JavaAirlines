package day23_MultiDmensionalArrays;

import java.util.Arrays;

public class C01_MDArray {
    public static void main(String[] args) {
        int arr [][]={{3,1,7},{6,10,2}};

        System.out.println(arr[0][2]);// 7
        System.out.println(arr[1][1]);// 10

        // ilk inner arrayin tum elementlerini yazdir dersek nasil yapilir

        System.out.println(arr[0]); // bize referans verir burada
        System.out.println(Arrays.toString(arr[0])); // arr[0] bir array oldugu icin direct yazdirilmaz
        // Arrays.toString method kullanilmali

        System.out.println(Arrays.toString(arr)); // dersek herbir arryin referansini yazdirir
        // elementlerin tumunu gormek isterseniz
        // MDArrays de tum elementleri uyazdirmak isterseniz deetotString methodu kullanilmali
        System.out.println(Arrays.deepToString(arr));

    }
}
