package day23_MultiDmensionalArrays;

public class C03_MDArrays {
    public static void main(String[] args) {

        // boyutlari belli bir array i element leri girmeden olusturalim

        // bir okulda icinde 24 ogrenci olan 8 sinif vardir

        // okul tek ilk kat
        int arr[][]=new int[8][24];

        // bir ilcede her birinde 24 ogrncilik 8 sinif bulunan 5 okulavardir
        int ilce[][][]=new int[5][8][24];

        // bir okulda 3 tane 24 kisilik iki tane 22 kisilik sinif vardir
        // bunu yapabayiz boyutlar farkli ama iki farkli array yapilabilir
        int sinif24[][]=new int[3][24];
        int sinif22[][]=new int[2][22];

        // olustururken elementtleri atama yaparsak farkli boyutta inner arrayler tanimlaya biliriz

        int arr1[][]={{3,1,5,12},{6,10,2}};
    }
}
