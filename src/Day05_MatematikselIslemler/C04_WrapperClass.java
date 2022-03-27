package Day05_MatematikselIslemler;

import java.util.Locale;

public class C04_WrapperClass {
    public static void main(String[] args) {

        // primitive data turu ile non primitive arasindaki farklar nelerdir?

        String str="Java";
        int sayi=10;


        System.out.println(str.toUpperCase(Locale.ROOT)); //JAVA
        System.out.println(str);
        //non-primitive dava turleri depolamak yaninda bir cok faydali metodlar sahiptir
        // primitive data turlerin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar(container)

        //primitive data turleri icin de bazi methodlar gerekli oldugunda
        // Java ara bir cozum uretmistir
        // Java her primitive data turunu non primitive olarak kullanabilmek icin ozel classlar olusturmustur
        // bunlara Wrapper denir

        double sayi2=20.5;
                //sayi2 primitive oldugu icin sayi2. dedigimizde hic bir method gelmiyor
        // ama D buyuk yazarak nonprimitive yaparsak

        Double sayi3=15.2;
        // sayi3 Wrapper Class olan Double Class ini kulandigindan
        // sayi3. dedigimizde bircok method geliyor. bu diger primitivler icinde gecerli




    }
}
