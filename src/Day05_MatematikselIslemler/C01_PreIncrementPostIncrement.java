package Day05_MatematikselIslemler;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {


        int sayi=10;
        // bu sayiyi 1 artirmak istersek
        sayi++;
        System.out.println(sayi); // 11 cikar sonuc

        sayi++;
        System.out.println("preincrement ten once " +sayi); // 12
        //  eger 11. ve 12. satirda yaptigim 2 islemi tek satirda yaparsam
        // java iki islemden once hangisini yapacagini bilmek ister
        //once artirir sonra yazdirirsak java yeni degeri yazdirir
        // ama once yazdirir sonra artirirsak java eski degeri yazdirir

        System.out.println("pre-increment satirinda " + ++sayi); // 13 once artirir sonra yazdirir
                                                                // buna pre-increment denir

        System.out.println("pre-increment den sonra " + sayi); //13

        System.out.println("post-increment satirinda " + sayi++); // 14 olarak yazar
        System.out.println("post-increment satirindan sonra " + sayi);




    }
}
