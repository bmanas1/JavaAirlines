package day07_IfElse_Statement;

public class C02_IfStatements {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        if (a<b && b<100) {
            System.out.println("istediginiz gerceklesecek");
            System.out.println("body icindeki tum kodlar calisir");

        }
        if (a>0) System.out.println("sus parentez olmazsa sadece bir satir calisir");

        // bir if cumlesinin daha anlasilir olmasini istiyorsaniz
        // if body sini {} icine yazmalisiniz
        // body yi {} icine yazmazsak da if cumlesi calisir
        // ancak ilk ; gordugunde if cumlesi bitmis olur

        System.out.println("2. satirda calisti");





    }
}
