package day08_ifElseIfStatements;

import java.util.Scanner;

public class C01IfelseStatements {
    public static void main(String[] args) {

        //girilen bir karakterin,harf olup olmadigini bulalim

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scanner.next().charAt(0);
        if ((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter<='z')) {
            System.out.println("Girdiginiz karakter bir harf ");
        }else {
            System.out.println("Girdiginiz karakter bir harf degil");
        }

    }
}
