package day13_stringMnipulation;

public class C01_SubString {
    public static void main(String[] args) {
        String str="Java ile IT cok guzel ";

        System.out.println(str.substring(5));// ile IT cok guzel //iden balayarak hepsini yazdiracak

        // yukarida ki Stringi kullanarak Mehmet hoca ile IT cok guzel

        System.out.println(str.replaceAll("Java","mehmet hoca")); // Mehmet hoca ile IT cok guzel

        // yada substring ilede yapilir
        System.out.println("mehmet hoca"+ str.substring(5));

        // IT cok guzel
        System.out.println(str.substring(9));// IT cok guzel

        // eger indexten sona kadar olan parcayi degil
        // belirli bir parcayi almak istersek
        // 2 parametre yazmak gerekir srt.substring(baslangicindex i,bitisinexi)
        // baslangic indexi inclusive/ dahil
        // bitis indexi exclusive/ haric

        System.out.println(str.substring(0,5));//Java ve bir bosluktur
        System.out.println(str.substring(0,1));//J
        String harf=str.substring(5,6); //bana 5. harf string olark bulalim. bi]urada charAt kullanamayiz kabul etmez
        // o yuzden substring kullanmali
        System.out.println(harf);

        str="Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7));//"" hiclik verecek

        //System.out.println(str.substring(5,2)); // calisinca hata verir bitis index baslangictan kucuk olamaz

        System.out.println(str.substring(str.length()-1));// son harfi verir r
        System.out.println(str.substring(str.length()-5));//son 5 harfi verir
        System.out.println(str.substring(str.length())); // son harften sonra hiclik yazzdirir






    }

}
