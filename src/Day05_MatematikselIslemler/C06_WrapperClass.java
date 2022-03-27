package Day05_MatematikselIslemler;

public class C06_WrapperClass {
    public static void main(String[] args) {

        String str1="12345";
        String str2="23456";

        // verilen iki Stringdeki sayilari toplayiniz
        // vrieln bir metin icindeki sayilar ile islem yapmaniz gerekebilir String de bunu yapmazsiniz
        // bu durumda Wrapper Class devreye girer.

        System.out.println( str1 +str2); // dersek toplamaz yanyana yazar cunli string // 1234523456
        // burada Wrapper Class yaridma gelir
        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));

        // Integer.valueOf methodu sadece sayisal degerlerde kullanili
        // 1 tane bile sayi disinda karakter olursa Java hata verir.



    }
}
