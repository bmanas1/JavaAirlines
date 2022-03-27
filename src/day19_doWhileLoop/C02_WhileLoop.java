package day19_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin ve
        // bu sayinin rakamlari toplamini yazdirin

        // bunu normalde magulus% ile yapiyorduk 7629 %10 =762 olur saonra 762%10 76 olur sonra 76%10 7
        // diye 0 a kadar giderdi

        int input=20;
        int rakam=0;
        int rakamlarToplami=0;

        while (input>0){
            rakam=input%10;
            rakamlarToplami+= rakam;
            input/=10;


        }
        System.out.println(rakamlarToplami);
    }
}
