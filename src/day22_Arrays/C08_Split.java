package day22_Arrays;

import java.util.Arrays;

public class C08_Split {
    public static void main(String[] args) {
        // verilen bir cumlede istene harfin kac defa kullnaildigini yazdiran
        // bir method olusturun

        String cumle="Nerede o 'hello world' yazdiramayan ogrenciler?";
        String harf="e";

        // benden method olusturmama isteni yor
        // once methhod olusturmali

        harfKacKereKullanilmis(cumle,harf);


    }

    public static void harfKacKereKullanilmis(String cumle, String harf) {
        int sayac=0;
        String karakterler[]=cumle.split(""); //cumleyi hiclik ile bolunce herbir harfi bolmus oluyoruz

        System.out.println(Arrays.toString(karakterler));
        // array deki her bir elemente bakacagiz 1 artiracagiz
        for (int i = 0; i < karakterler.length; i++) {
            if (karakterler[i].equals(harf)){
                sayac++;

            }

            }
        System.out.println("Aradigniz " + harf + " verilen cumlede " + sayac + " adet kullanilmistir");


        }

    }

