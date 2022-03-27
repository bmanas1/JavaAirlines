package day17_forLoop;

public class C04_Forloop {
    public static void main(String[] args) {

       // 10 ile 30 arasindaki(10 ve 30 dahil)
        // sayilari aralarinda virgul olarak ayni satirda yazdirin

        for (int i = 10; i <= 30 ; i++) {

            System.out.print(i + ", ");
        }

            // bir sorun var 30 da virgul koyuyor
            // sorunu teknik olarak cozmeli
            // sayilar kullanicidan aliniyorsa mesela



            int baslangic=10;
            int bitis=30;
            for (int j = baslangic; j <=bitis ; j++) {

                if (j<bitis){
                    System.out.print(j+", ");
                }else{
                    System.out.println(j);
                }

            }



        }
    }


