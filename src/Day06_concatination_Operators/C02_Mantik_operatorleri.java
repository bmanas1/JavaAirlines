package Day06_concatination_Operators;

public class C02_Mantik_operatorleri {

    public static void main(String[] args) {

        System.out.println(5+2==8);//false

        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2!=8;

        System.out.println(sonuc1); // true


        boolean sonuc2=5>4 && 7>9 && 6+3==9 && 5+2!=8;

        System.out.println(sonuc2); // false

        boolean sonuc3=5>4 & 7>9 & 6+3==9 & 5+2!=8;
        System.out.println(sonuc3); // false

        // sonuc && ile Yni ama & olursa islemi sonuna kadar kontrol eder.
        // && ise ilk buldugu false da durur sonuc verir

        int sayi3=15;
        // sayi3 un 10 ile 20 arasinda oldugunu tru diyerek dondurelim
        // matematikte olsa 10<sayi3<20 denirdi ama Java 3 lu karsilastirma yapmaz her zaman ikili
        // ikili karsilastirma yapip mantik operatorleri ile birlsetirmeliyiz

        System.out.println(10<sayi3  && sayi3 <20); // true

        int sayi4=5;
        System.out.println(sayi4<10 || sayi4 >20); // true






    }
}
