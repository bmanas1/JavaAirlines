package day26_forEachLoop_constructor;

public class C01_ForEchLoop {
    public static void main(String[] args) {

        int arr[]={2,4,5,8,11};

        // elementleri for loop ile yazdiralim

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" ");


        }

        System.out.println("");

        // bunu for-each loop ile yaparsak
        // for-each loop u calistirmak icin hedef bir collection vermeliyiz

        for (int each: arr
             ) {
            System.out.print(each+" ");
        }
        // ister for loop ister for each loop ile yap karar sizin
        // for-each artisi bitis ve baslangic degerleri ne bakmaya gerek kalmadan
        // collectionstan tum elementleri bize getirir

        // dezavantaji ne // indexe bagli bir islem yapamayiz. sirasi ile gelemez
        // yani ilk 3 elemnti direc yazdir sonrakileri 2 er artir diyemem

    }
}
