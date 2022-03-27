package day17_forLoop;

public class C08_Palindrome {
    public static void main(String[] args) {
        // Soru 9 ) Interview Question Kullanicidan bir String isteyin. 
        // Kullanicinin girdigi String’in palindrome olup olmadigini 
        // kontrol eden bir method  olusturun.
        
        String input="Java";

        palidromeKontrolEt(input);


    }

    private static void palidromeKontrolEt(String input) {
        // kontrol edip sonucu sadece yazdiracaksam void

        String terstenInput="";
        for (int i = input.length() - 1; i >= 0 ; i--) {
            terstenInput+=input.charAt(i);

        }
        System.out.println("Girdiginiz kelimenin tersten yazilisi "+ terstenInput);
        // karsilastirma equals mu ignorecase mi
        if (input.equalsIgnoreCase(terstenInput));

        System.out.println("Girdiginiz kelime Palindrome");

    }
}
