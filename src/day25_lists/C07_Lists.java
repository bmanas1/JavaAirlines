package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C07_Lists {
    public static void main(String[] args) {
        // bir listede ortalamanin ustunde olan element sayisini  bulunuz

        List<Double> sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);

        // bir soru icin kod yazmaya basalmadan oncee adimlari yazin

        // 1. oncee ortalamayi bulurum sonra
        // ortalamainin ustunde olanlari bir liste atarim yada yazdiririm
        // ortalamayi nasil bulurum // oncee toplamini bulurum

        Double ortalama=0.0; // double yapsanda problem yok wrapp claslar ile primitive ler arsi problem yok
        Double toplam=0.0;

        for (int i = 0; i < sayilar.size(); i++) {
            toplam+=sayilar.get(i);

            ortalama=toplam/sayilar.size();
            System.out.println(ortalama);

            // icine atacagimiz bir list olusturalim
            List<Double> ortalamaininUstundekiler= new ArrayList<>();
            for (int j = 0; j < sayilar.size(); j++) {
                if (sayilar.get(i)>ortalama){
                    ortalamaininUstundekiler.add(sayilar.get(i));

                }


            }
            System.out.println(ortalamaininUstundekiler);

        }




    }
}
