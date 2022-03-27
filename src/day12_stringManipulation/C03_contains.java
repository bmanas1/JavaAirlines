package day12_stringManipulation;

public class C03_contains {
    public static void main(String[] args) {
        // soru 1 Kullanicidan bir email adresi girmesini isteyin
        // mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz"
        //@gmail.com ile bitiyorsa"Emailiniz kaydedildi
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontrol edin" yazdirin

        String email="mulkiyeayboy@hotmail.com";
        String arananMetin="@gmail.com";

        if (!email.contains(arananMetin)) {// bu cemle unlemsiz iceriyorsa demek oldu
            // bir boolean ifadeyi tersine cevirmek icin ! isareti eklenin en basa.
            //boylece icermiyorsa olmus olur
            System.out.println("Lutfen gmail adresi giriniz");

        }  else if(email.lastIndexOf(arananMetin)==(email.length()-10)){
            System.out.println("Emailiniz kaydedildi");

        } else{
            System.out.println("lutfen yazimi kontrol edin");
        }



    }
}
