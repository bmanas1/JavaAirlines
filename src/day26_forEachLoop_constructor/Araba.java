package day26_forEachLoop_constructor;

public class Araba {
    /*
    javada her class olusturudugumuzda
    java o class dan ileride objeler uretmek gerekecegini bilir
    ve biz ozellikle belirtmesek de java
    her olusturdugu class a bir constructor koyar


    javanin class olusturuken class a koydugu constructor a
    DEFAULT constructor denir ve Gorunmuz

    Eger gorunur bir Constructorumuz olsun istersek
    default constructor ile ayni gorevi yapan bir constructor olusturabilirz
    veya istersek ayni kaliptan farkli desenlerde objeler olusturmak icin
    farkli ozelliklerde constructorlar da olustura bliriz


    constructor lari birbirinden farklilastiran tek
    ayricalik kullanilan parametre sayisi ve parametre data turudur
     */

    // class ismi ile ayni olmak zorunda
   // methoda benziyor ama returntype yok

    public Araba(){
        System.out.println("parametresiz Constructor calisti"); // burasi sembolik olrak gorelim diye yapildi

    }

    /*bir cod blogunun method yada constructor olmasindan emin olmak istiyorsaniz
    iki seye dikkat edersiniz
    1- constructorler in ismi class ismi ile ayni olmak zorundadir yani Buyuk harf ile baslar
    2- Constructor larin return type i olmaz

    ozetle : Constructorun adi Class adi ile ayni olmali ve return type i olmamali


     */

    public Araba (String renk){
        System.out.println(renk + "renkli bir araba uretildi");
    }
    public Araba (int yil){
        System.out.println(yil + "model bir araba uretildi");
    }
    public Araba (int yil,String renk){
        System.out.println(yil + " Model "+ renk + " renkli bir araba uretildi");
    }
}
