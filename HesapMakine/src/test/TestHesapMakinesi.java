package test;
import tr.edu.istiklal.HesapMakinesi;

import java.util.Scanner;

public class TestHesapMakinesi {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz");
        double s1 = input.nextDouble();
        System.out.println("İkinci sayıyı giriniz");
        double s2 = input.nextDouble();
        HesapMakinesi h1 = new HesapMakinesi(s1,s2);
        System.out.println("İşlem seç");
        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Çarpma");
        System.out.println("4-Bolme");
        int secim=input.nextInt();

        switch (secim){
            case 1:
                System.out.println("Sonuç"+h1.getTopla());
                break;
            case 2:
                System.out.println("Sonuç"+h1.getCikar());
                break;
            case 3:
                System.out.println("Sonuç"+h1.getCarp());
                break;
            case 4:
                System.out.println("Sonuç"+h1.getBol());
                break;
            default:
                System.out.println("Geçersiz işlem");
        }


        input.close();




    }
}