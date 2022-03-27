package day14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {

        String str=" Siz ne derseniz deyin, Java bildigiin okur,  ";

        str.trim();
        System.out.println(str);// bu hali ile calistirilirsa  basluklar olur
        System.out.println(str.length());

        //tamamen bosluktan kutulmak icin

        str= str.trim();
        System.out.println(str); // bosluksuz olarak calistirir
        System.out.println(str.length());
        System.out.println(str.trim()); // buda olur



    }
}
