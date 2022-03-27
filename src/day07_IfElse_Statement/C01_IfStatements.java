package day07_IfElse_Statement;

public class C01_IfStatements {
    public static void main(String[] args) {

        int a=2;
        int b=3;

        if (a==b){

            System.out.println("verilen sayilar esit");

            //2 ile 3 esit olmadigi icin false  dolayis ile cumleyi yazdirmaz


        }
        if (a>100){
            System.out.println("a yuzden buyuk"); // calismaz

        }
        if (a*b>1){
            System.out.println("sayilarin carpimi 5 ten buyuk");

            // bagimsiz if cumleleri kendileri disindaki kodlarla ilgilenmez
            // bir sart ve o sarta bagli sonuca odaklidir
            // birden fazla bagimsiz if cumlesi oldugunda hepsinin body calisabilecegi gibi
            // hicbirinin body si calismayabilir
        }
    }
}
