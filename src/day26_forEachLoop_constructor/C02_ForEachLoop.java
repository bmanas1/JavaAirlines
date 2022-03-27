package day26_forEachLoop_constructor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {

        // 10 elementlibir list olusturalim

        int arr[]={2,5,4,6,4,9,7,1,3,10};
        // ya bu sekilde yaprsiniz
        // yada once listeyi olusturup element ekleriz

        List<Integer> sayilar = new ArrayList<Integer>();
        for (int each: arr
        ) {
            sayilar.add(each);
        }
        System.out.println(sayilar); // [2, 5, 4, 6, 4, 9, 7, 1, 3, 10]
        // sayilar listesinde 3'e bolunemeyen sayilari for-each loop ile yazdiralim
        for (int each: sayilar
        ) {
            if (each%3 != 0){
                System.out.print(each + " ");
            }
        }

    }
}
