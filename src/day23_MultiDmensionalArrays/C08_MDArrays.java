package day23_MultiDmensionalArrays;

public class C08_MDArrays {
    public static void main(String[] args) {

       // Soru 2) Asagidaki multi dimensional array’in
        // ic array’lerindeki son elemanlarin carpimini
        // ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }

        // eger ic arraylerin ici ile ugrasiyorsak loop kullanmaliyiz

        int arr[][]={ {1,2,3}, {4,5,}, {6,0,2} };
        int carpim=1; // carpimlari icn bir kontainner olusturdum


        for (int i = 0; i <arr.length ; i++) {
              carpim *=arr[i][arr[i].length-1];

            }
        System.out.println("son elementlerin carpimi " + carpim);
        }
        // bir kod tekrar tekrar calisiyorsa forloop icinde yazdirmissindir

    }

