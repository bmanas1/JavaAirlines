package Day04_dataCastingIncrement;

public class C04_ExpliciteNarrowing {

    public static void main(String[] args) {

        int sayi1=879;
        double sayi2=10;

        double sayi3=sayi1/sayi2; // 87.9  cikarir biri int digeri double double buyuk oldugi icin problem yok Auto widening
        System.out.println(sayi3);

        // biraz once sorun verdigi hali ile yazalim buyuk degeri kucuk degere cevirelim

        // int sayi4 = sayi1/sayi2; // burayi java otomatik yapmaz
        // duzgun calismasi icin

        int sayi4 = (int) (sayi1/sayi2); // 87.9
                                         // deger double verialbe int
                                        // yani variable daha dar  dolayisi ile java bunu otomatik yapmaz
                                        // sorumlulugu ustlenmenizi ister
                                        // sag tarafa  yazdidigin (int) sorumluluk bende demek
                                        // (int) bunu sayi2 yanina da koyabilirsin fark etmez say1 zaten int idi
                                        // yani int sayi4 = (sayi1/(int) sayi2); bu sekildede olur

        System.out.println(sayi4); // sonuc 87

        // bir adim ilerisi

        int sayi5=140; //  byte sayi6=sayi5; // java bunu kabul etmiyor sag taraftaki deger int > sol taraftaki variable byte
        byte sayi6=(byte)sayi5; // (byte) ekleyince kabul etmesi gerek normalde
        System.out.println(sayi6); // ciktisi -116 oluyor ne alaka byte siniri 127 normalde
                                    // 140-127= 13 olamli ama - tarafa gidip islem yapiyor (-128)- (+13) = -116

        sayi5=129;
        sayi6=(byte)sayi5;
        System.out.println(sayi6);

        sayi5=260;
        sayi6=(byte)sayi5;
        System.out.println(sayi6);

        sayi5=520;
        sayi6=(byte)sayi5;
        System.out.println(sayi6);

        sayi5=-130;
        sayi6=(byte)sayi5;
        System.out.println(sayi6);












    }
}
