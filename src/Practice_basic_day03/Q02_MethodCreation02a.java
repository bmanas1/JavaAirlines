package Practice_basic_day03;

public class Q02_MethodCreation02a {
    public static void main(String[] args) {
         /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "ggdsdfsdfddgfdfgdfgkkkkk"
        output: gdsfk
     */

        // method yazilacak
        // karekterler 1 defa yazilacak
        karakterleriBirKereYazdir("ggdsdfsdfddgfdfgdfgkkkkk");
    }

    private static void karakterleriBirKereYazdir(String str) {
        String sonuc="";
        for (int i = 0; i < str.length(); i++) {
            if (!sonuc.contains(str.substring(i,i+1))){
                sonuc += str.substring(i,i+1);

            }
        }
        System.out.println(sonuc);
    }
}
