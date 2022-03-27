package Day05_MatematikselIslemler;

public class C02_PreIncrementPostIncrementornek {

    public static void main(String[] args) {

        int a=15;
        int b=++a;
        System.out.println("B degeri: " + b);

        int c=15;
        int d=c++;
        System.out.println("D degeri:" + d);
        System.out.println("C degeri:" + c);


    }
}
