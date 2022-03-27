package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C05_GetIndex {
    public static void main(String[] args) {

        List<Integer> sayilarlist = new ArrayList<>();
        sayilarlist.add(5); //[5]
        sayilarlist.add(3);//[5,3]
        sayilarlist.add(0,7);//  [7,5,3]
        sayilarlist.add(2,7); //[7, 5, 7, 3]
       // sayilarlist.get(2);// bunu getirttik ama avada gormek icin ya atayacagiz yada yazdiracagiz
        System.out.println(sayilarlist.get(2)); // 7
        System.out.println(sayilarlist); // [7, 5, 7, 3]


    }



}
