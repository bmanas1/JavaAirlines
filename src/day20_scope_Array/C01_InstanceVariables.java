package day20_scope_Array;

public class C01_InstanceVariables {

    int sayi;
    String bransIsmi="Java";
    boolean okuldaMi;


    public static void main(String[] args) {
        // sayi veriable i static olmadigi icin main method dan direk kullnilamz
        // instance variable lara static method lardan ulasabilmek icin obje olusturmamiz gerekir
        // bugune kadar Scanner Scan veya Random objeleri olusturduk

        C01_InstanceVariables obj1=new C01_InstanceVariables(); // ilkkez bir class objesi olustu
        System.out.println(obj1.sayi);// obj. deyince yukardaki optionlar geliyor // bu 0 yazdirir
        obj1.sayi=10;// olarak kabul eder
        System.out.println(obj1.sayi); // once 0 yukaridakini sonra 10 verir
        obj1.bransIsmi="SQL";
        System.out.println(obj1.okuldaMi);//

        // bir obje daha olusturmak istiyorum
        C01_InstanceVariables obj2=new C01_InstanceVariables();
        System.out.println(obj2.sayi);// 0 olur
        System.out.println(obj2.bransIsmi);

        obj1.okuldaMi=true;
        System.out.println(obj2.okuldaMi);// default devreye girer ve false olur

    }
}
