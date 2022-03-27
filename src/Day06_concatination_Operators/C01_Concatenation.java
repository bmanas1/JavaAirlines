package Day06_concatination_Operators;

public class C01_Concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        int sayi2=3;
        // vRIABLE LARIN DEGERLERINI DEGISTIRMEDEN
        // asadagidaki ifadeleri bu variable lari kullanarak yazdir

        //Java5Guzel
        System.out.println(str1+sayi1+str2);

        //2Guzel15

        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);

        //Java22
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));
        //53Guzel
        System.out.println(sayi1 +sayi2+str2); // 8Guzel oldu olmza
        System.out.println(sayi1 +(sayi2+str2)); // 53Guzel  boyle olur  dama daha iyisi

        System.out.println(""+sayi1+sayi2+str2); // 53Guzel
        /* eger tamamen sayilardan olusan bir string varsa ve biz bunu int a cevirmek istersek
        integer.valueof(str)

        birsayiyi stringe cevrimek istersem ""+sayi  yaparim

         */


    }
}
