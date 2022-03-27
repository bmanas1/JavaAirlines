package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_listedenTekrarliElementleriSilme {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece bir kere yazdiran
        // bir method olusturun
        // orn: [1,3,5,3,5,6,1,7]
        // output : [1,3,5,6,7]

        // once liste olusturmali
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        // bir method olusturacagiz
        tekrarsizListeOlustur(sayilar);


    }

    public static void tekrarsizListeOlustur(List<Integer> sayilar) {

        // verilen bir listede tekrar eden sayilari sadece 1 kere yazdiran
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]
        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(1);
        sayilar1.add(3);
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(5);
        sayilar1.add(6);
        sayilar1.add(1);
        sayilar1.add(7);
        tekrarsizListeOlustur1(sayilar1);
        System.out.println(sayilar1);
    }
    public static void tekrarsizListeOlustur1(List<Integer> sayilar1) {
        List<Integer> tekrarsizList = new ArrayList<>();
        for (int i = 0; i <sayilar1.size() ; i++) {
            if (!tekrarsizList.contains(sayilar1.get(i))){
                tekrarsizList.add(sayilar1.get(i));
            }
        }
        System.out.println(tekrarsizList);
    }
}
