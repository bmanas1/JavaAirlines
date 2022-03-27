package day11_stringManuplation;

import java.util.Scanner;

public class C05_IndexOf {
    public static void main(String[] args) {

        String str1="Java bir baska guzel valla cok guzel";
        // calisir ama konsolda goremem ma dondurdugu sey J nin index ini dondurecek
        //istersek char olarak veridgimiz bir harfin indexini bize dondurur

        System.out.println(str1.indexOf('J')); //0
        //istersek bir harf yada metin olalrak verdigimiz Stringin indexini dondurur

        System.out.println(str1.indexOf('l'));
        System.out.println(str1.length()-1);
        System.out.println(str1.indexOf("aska"));// 10

        // bir den fazla ayni harf var ise ?
        System.out.println(str1.indexOf('b')); // 5 buldugu ilk eslesmenin index ini dondurur
        System.out.println(str1.indexOf('b',5));
        // bu method da java aramaya fromindex olarak yazdigimiz index ten baslar
        //(inclusive)

        // verilen string de ki 2. a harfinin index ini bulalim
        int ilkindex=str1.indexOf('a'); // 1
        System.out.println(str1.indexOf('a',ilkindex+1));

        // verilen string de ki 2. b harfinin index ini bulalim
        int ilkindex1=str1.indexOf('b'); // 1
        System.out.println(str1.indexOf('b',ilkindex1+1));//9

        // 20. index ten sonra guzel aratalim
        //kelimede aratabiliyoruz belli bir yerden sonra
        System.out.println(str1.indexOf("guzel",20));//31

        // metinde olmayan bir harf aratsak
        System.out.println(str1.indexOf("y")); // y yok demesi lazim ama return type i index
        // yok demenin sayisal karsiligi olarak java -1 dondurmeyi tercih eder

        // kullanicidan mail adresini isteyin @ isareti icermiyorsa gecersiz yazdirin
        // iceriyorsa mailiniz kabul edildi yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen mailinizi yazin");
        String mail=scan.next();
        if (mail.indexOf("@")==(-1)){
            System.out.println("Gecersiz");
            }else{
            System.out.println("mailiniz kabul edildi");
            //OZet: indexof methodu icerisine yazilan String veya char in
            // metinde hangi indexte oldugunu bize dondurur
            // eger aradigimiz metin veya char yoksa olmadiginin delili olarak
            //bize -1 dondurur
        }
        }








    }

