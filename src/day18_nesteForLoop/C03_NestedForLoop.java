package day18_nesteForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        /*Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
                *
        * *
        * * *
        * * * *
        * // tek sira ve tek sutun degilse mutlaka nestedforloop kullan

         */
        int input=5;
        //int input2=8;

        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=i ; j++) {
                // nested for loop ya kare yada dikdortgen veya ucgen formatinda olabilir for (int j = 1; j <=input ; j++)
                //dikdortgen istedigimizde iki loop icinde bagimsiz end pointi belirleriz
                // ucgen yapmak isteyince inner loopun end point ini alarak outr degiskenine baglariz
                System.out.print("* ");

            }
            System.out.println("");
        }



    }
}
