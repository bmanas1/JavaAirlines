package practiceLesson;

import java.util.Scanner;

public class C01E_day02Q08_StringManipulation {
    public static void main(String[] args) {

//Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.
        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

            Scanner scan = new Scanner(System.in);
            System.out.print("String 1 :");
            String str1 = scan.nextLine();
            System.out.print("String 2 :");
            String str2 = scan.nextLine();
            System.out.println("Stringlerin 1. method ile birlesimi :" + str1 + " " +str2);
            System.out.println("Stringlerin 2. method ile birlesimi :" + str1.concat(" " +str2));
            String str1ilksiz = str1.substring(1);
            String str2ilksiz = str2.substring(1);
            System.out.println("String lerin ilk harfsiz halleri :" + str1ilksiz + " " + str2ilksiz);
            //  String a = "parlak";
            //  System.out.println(a.substring(0));
        }
    }


