package day09_ternary_Switch;

public class C05_ternary_Sorular {
    public static void main(String[] args) {
        // soru 1 Kullanicidan iki sayi alin ve buyuk olmayani yazdirin

        int sayi1=15;
        int sayi2=9;
        System.out.println(sayi1>sayi2 ? sayi1 : sayi2);

        // soru 2 kullanicidan bir tam sayi alin ve sayinin tke veya cigt oldugunu yazdirin

        int sayi=28;
        System.out.println(sayi%2==0 ? "Positif cift sayi" : "Positif tek sayi");

        // saoru 3 kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

        int sayi4=-6;
        System.out.println(sayi4>=0 ? sayi4 : (-1)*sayi4);

        // nested
        int y=12;
        System.out.println((y>5) ? (y<10?2*y:3*y) : (y>10? 2+y:3+y)) ;
        System.out.println(((y>5) ? (y<20?2*y:7*y) : (y>10? 8+y:3+y)));


    }
}
