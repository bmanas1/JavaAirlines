package Day04_dataCastingIncrement;

public class C05_IncrementDecrement {

    public static void main(String[] args) {

        int sayi=20;
        System.out.println(sayi +10); // 30
        // bu satirda sayiyi 10 artirmadim
        // sayinin 10 fazlasini yazdirdim

        System.out.println(sayi); // 20
        //eger atama yapmazsak sayida yaptigimiz artirma veya azaltma kalici olmaz

        sayi=sayi+10; // bu sekilde atama yapilmis oldu
        System.out.println(sayi);

        // bir ileri adimi
        // ikidefa sayi atamasi yapmamak adina asagidaki formul kulanilabilir

        System.out.println(sayi=sayi+=10); // sonuc 40
        System.out.println(sayi); // 40 // burda bakiyoruz sayiyi akilda tutmusmu evet

        System.out.println(sayi+=10); // degeri 50 buda en profesyonel yazilim sekli
        System.out.println(sayi);//50

        // bir variable in degerini kalici sekilde artirmak veya azaltmak isterseniz assaignment sarttir

        //yarinki konu onemli

        System.out.println("31.satir: " + sayi++); // 50
        System.out.println("32.satir: " + sayi);   // 51 yazdirir neden

        System.out.println("34.satir: "+ ++sayi); // 52
        System.out.println("35. satir: " + sayi); // 52 neden ikisi ayni yarin anlatilacak






    }
}
