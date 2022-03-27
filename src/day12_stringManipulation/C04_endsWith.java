package day12_stringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {

        // soru 1 Kullanicidan bir email adresi girmesini isteyin
        // mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz"
        //@gmail.com ile bitiyorsa"Emailiniz kaydedildi
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontrol edin" yazdirin

        String email="mulkiyeayboy@gmail.com.tr";
        String arananMetin="@gmail.com";

        if(!email.contains(arananMetin)){
            System.out.println("Lutfen gmail adresi giriniz");

        } else if(email.endsWith(arananMetin)){
            System.out.println("Emailiniz kaydedildi");
        }else{
            System.out.println("lutfen yazimi kontrol edin");
        }


    }
}
