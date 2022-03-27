package day28_constructor;

public class StaticKeyword {
    static int sayi1;
    int sayi2;
    // class leveldaki degerlere atama yapma mecburiyeti yok
    // java default atar
    public static void main(String[] args) {
        /* static variable lar direct class a baglidir
          class icerisinde yapilan herturlu degisiklik static variablelarda kalici olur

          instance variable lar ise obje ye baglidir
          instance variable lara sadece obje uzerinden ersiilebilir
          ve bir obje uzerinden erisilerek yapilan degisiklik
          instance veriable in degerini tum objeler icin kalici olarak degistirmez
          sadece o obje icin instance variable degrini kalici olarak degistirir
         */

        System.out.println("sayi1 :"+ sayi1);//0
        // System.out.println("sayi2 :"+ sayi2); static olmadigi icin main method dan direc alamayiz
        // ne yapmak lazim
        StaticKeyword obj1=new StaticKeyword();
        System.out.println(obj1.sayi2); // bu sekilde yazdirir // 0

        sayi1++;
        obj1.sayi2++;
        System.out.println("sayi1: "+ sayi1); //1
        System.out.println(obj1.sayi2); //1
        System.out.println(obj1.sayi1); // highlight yapti direk te ulasabilirsin demek

        StaticKeyword obj2=new StaticKeyword();

        System.out.println(obj2.sayi2);//0
        System.out.println(obj2.sayi1); // 1

        obj2.sayi1++;
        obj2.sayi2++;

        System.out.println(obj2.sayi2);//1
        System.out.println(obj2.sayi1); // 2

        System.out.println(obj1.sayi2);//1
        System.out.println(obj1.sayi1); // 2

        obj1.sayi1++;
        obj1.sayi2++;

        System.out.println(obj1.sayi2);//2
        System.out.println(obj1.sayi1); // 3
        //obje 1 uzerinden yaptigimz degisiklik sadece kendisini baglar

        System.out.println(obj2.sayi2);//1
        System.out.println(obj2.sayi1); // 3


    }
}
