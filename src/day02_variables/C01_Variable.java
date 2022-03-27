package day02_variables;

public class C01_Variable {
    public static void main(String[] args) {
        // bir variable olustururken icerisnie koyacagimiz datanin alabilecegi degerleri uygun girmeli
        //ornegin bir sehrin nufusundan bahsediyorsak
        //variable imizin data turu string, boolean, char veya double olmaz
        // geriye kalan tamsayi turlerinden sehrin nufusunu icine alabilecek buyuklukte bir data turu seccilir
        //biz kur boyunca genelde tam sayilar icin int ondalik sayilar icin double kullanacagiz
        System.out.println("hello world yazdiran javayi halleder");
        int level=1;
        System.out.println(level);

        boolean ogrenciMi=true;
        boolean yagisVarmi=false;

        System.out.println(ogrenciMi);

        char ozelSembol='2';
        char sayi='2';

        System.out.println(sayi);

    }
}
