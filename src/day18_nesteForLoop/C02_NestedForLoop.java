package day18_nesteForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        // kullanicidan bir rakam alip carpim tablosu olusturalim

        int input=5;
        //1 2 3   1*1 1*2 1*3
        //2 4 6   2*1 2*2 2*3
        //3 6 9   3*1 3*2 3*3
        // size birden inputa kadar loop yapin deseydim kolay
        for (int i = 1; i <=input ; i++) {
            //System.out.println(i + " ");
            //bunu yapmamak icin javada nested forloop var
            for (int j = 1; j <=input ; j++) {
                System.out.print((i*j) +" ");

            }
            System.out.println(" "); // satiri asagiya gecirme

            // en onemli cumle outer loop bir deger aldiginda
            // inner loop bastan sona calisir
            // ve outer loop deger degistirir
            // sonra inner loop yeniden calisir

        }


    }
}
