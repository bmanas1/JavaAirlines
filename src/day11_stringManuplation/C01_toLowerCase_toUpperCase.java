package day11_stringManuplation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {

    public static <string> void main(String[] args) {

       string str= (string) "Java Guzeldir";

        // biz string methodlarini arka arkaya kullanabilirz
        // mesela ikinci kelimenin ilk g harfini kucuk yazdiralim
        // normalde charAt methodu ile alabiliyorduk
        // str.charAt(5); boyle yazdigimizda sonuc artik string degil char olacaktir
        // dolayisi ile string de yapmka istidigimiz tum degisiklikleri once yapip
        // sonra charAt methodunun kullanmaliyiz

        System.out.println(((String) str).toLowerCase().charAt(5));

        System.out.println(((String) str).toUpperCase(Locale.forLanguageTag("tr")));




    }
}
