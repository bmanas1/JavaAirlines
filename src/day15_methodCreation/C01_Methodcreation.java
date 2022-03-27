package day15_methodCreation;

public class C01_Methodcreation {
    public static void main(String[] args) {

        String str="Java ogrenmek cok zekli";

        // str in ilk 4 harfini almak istesek
        //String olmadan java olmaz o yzuden kolay erisieln methodlar olusturulmus mesela .substring
        // kullanabileceginiz hazir methodlar var ise onu almali
        str.substring(0,4);

        // bir progrm yaparken kodlarimizi daha kisa ve anlasilir olmasi icin
        // surekli kullanabilecegimiz kod bloklari hazir olarak bir yere koyar
        // ihityacimiz oldukca alip kullniriz

        // methodlar robotlara benzerler demistik neden
        // bir robotu yapmak robotun yaptigi isi yapmaktan daha zor
        // method olusturmak bazen o methodun yapava=cagi is yapmaktan zor olabilir
        // 1 islemi sadece 1 kere yapacaksak method kulanmamizagerek olmaya bilir
        //ancak ozellikle cok kullanacagimiz islemler icin
        // her seferinde yeniden ayni kodlari yazmak yerine
        // bu iselmi yapan hazir bir method olusturmak cok daha protiktir

        // bazen bir class icerisinde cok uzun kodlar yazarsak
        // tum class in anlasilmasi zolasabilir
        // bunun yerine kod un kisimlarini ayri method lar olarak olusturup
        // main method icerisisnde istedigimiz sekilde bu methodlar i kullaniriz

    }
}
