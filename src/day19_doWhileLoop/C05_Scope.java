package day19_doWhileLoop;

public class C05_Scope {
    // 1. bir method da olusturdugunuz variable sadece o methoda gecerli
    // alt taki sayi=20 yi alttaki public static te kullanilmaz
    // 2. tum methodlarin kullanmasini istiyorsak class levelda yazmaliyiz
    // public class C05_Scope{ tan sonra olustururuz
    // burada devreye static clubu girer
    // Class level da olusturdugumuz variable i
    //   -- static yaparsak tum methodlar kullanabilir
    //   -- static olmazsa (instance) ozaman static olmayan methodlar kullanabilir
    // 3. loop icinde olusturulan variable lar loop icerisinde kullanilabilir
    // ama loop un disinda kullanilamaz

    static String kurs="Java";
    int level=10;

    public static void main(String[] args) {

      int sayi=10;
        System.out.println(kurs); // kullanabiliryorum
        // System.out.println(level); kullanamiyoruz
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            int loopSayi=20;

        }
        // System.out.println(i); burada olusmuyor
    }
    public static void method1(){
     // static aricalikli bir kluptur demistik
        System.out.println(kurs);
        // burda level kullanmiyoruz
    }
    public void mehtod2(){
        System.out.println(kurs);
        System.out.println(level);

    }
}
