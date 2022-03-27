package Day04_dataCastingIncrement;

public class C02_AutoWidening {

    public static void main(String[] args) {

        boolean dogruMu=true;
        //String str=dogrumu; // sol String sag boolean olunca kabul etmiyor

        byte sayi1= 44;
        System.out.println(sayi1); // sonuc 44

        short sayi2=sayi1; // esitligin salu short sagi ise byte olmasina ragemn itiraz almiyor
                          // deger olarak atanan data turu variaable data turundne kucuk oldugu icin java sorun etmez
                            // auto widening
        System.out.println(sayi2);

        double sayi3 =sayi2;
        System.out.println(sayi3); //double oldugu icin 44.0


    }
}
