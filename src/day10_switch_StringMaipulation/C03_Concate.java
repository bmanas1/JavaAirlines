package day10_switch_StringMaipulation;

public class C03_Concate {
    public static void main(String[] args) {

        String str1="Java";
        String str2="candir";

        // Java candir yazdiralim
        // oncesinde + ile yapiyoruz
        System.out.println( str1 + " " + str2);

        String cumle=str1.concat(str2); //Javacandir
        cumle=str1.concat(" ").concat(str2);
        System.out.println(cumle); //Java Candir

        // cancat icinee string degilde sayi veya boolean deger yazsak kabul etmez
        // concat method u icine string parametre ister yazmak istersek onu string haline getirmelisiniz
        // ornegin cumle=str1.concat(""+5); sonuna yada basina hiclik eklenerek yaplir string



    }
}
