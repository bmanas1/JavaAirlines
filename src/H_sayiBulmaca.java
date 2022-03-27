import java.util.Random;
import java.util.Scanner;

public class H_sayiBulmaca {
    public static void main(String[] args) {
        // bilgisayara 1 ila 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyu yada kucult diye kullaniciya yol goserin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazsirin

        Random rnd = new Random();
        int sayi=rnd.nextInt(100); // burasi 100 den kucuk rastgele bir sayi olusturur

        Scanner scanner = new Scanner(System.in);
        int tahmin=0;
        int sayac=1;
        // kac seferde bulacagini bilmedigimiz icin while loop yapmali

        while (sayi!=tahmin){
            System.out.println("Lutfen bir sayi giriniz");
            tahmin=scanner.nextInt();

            if (tahmin>sayi){
                System.out.println("daha kucuk bir sayi soylemelisiniz");
            }else if (tahmin<sayi){
                System.out.println("daha buyuk bir sayi soylemelisiniz");

            }
            sayac++;

        }
        System.out.println("Tuttugunuz sayi  " + (sayac-1)+ " tahminde buldunuz");
    }
}
