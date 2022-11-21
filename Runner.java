package alancevrehesaplama;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Islem yapmak istediginiz sekli seciniz.\nKare => 1\tDikdortgen => 2\t  Ucgen => 3\t Cember => 4");
        int secim = input.nextInt();
        Kare kare = new Kare();
        Dikdortgen dikdortgen = new Dikdortgen();
        Ucgen ucgen = new Ucgen();
        Cember cember = new Cember();

        switch (secim){
            case 1:
                System.out.print("Yapmak istediginiz hesaplamayi seciniz.\n1 = Alan Hesapla \t2 = Cevre Hesaplama : ");
                int sayi = input.nextInt();
                System.out.print("Karenin kenar uzunlugunu giriniz : ");
                double kenar = input.nextDouble();
                switch (sayi){
                    case 1:
                        System.out.println("Karenin alani : " + String.format("%.2f",kare.alanHesapla(kenar)));
                        break;
                    case 2:
                        System.out.println("Karenin cevresi : " + String.format("%.2f",kare.cevreHesapla(kenar)));
                        break;
                    default:
                        System.out.println("Gecersiz secim yaptiniz.");
                        break;
                }
                break;
            case 2:
                System.out.print("Yapmak istediginiz hesaplamayi seciniz.\n1 = Alan Hesapla \t2 = Cevre Hesaplama : ");
                int sayi1 = input.nextInt();
                System.out.print("Dikdortgenin kisa kenar uzunlugunu giriniz : ");
                double kisaKenar = input.nextDouble();
                System.out.print("Dikdortgenin kisa kenar uzunlugunu giriniz : ");
                double uzunKenar = input.nextDouble();

                    switch (sayi1){
                        case 1 :
                            System.out.println("Dikdortgen alani : " + String.format("%.2f",dikdortgen.alanHesapla(kisaKenar, uzunKenar)));
                            break;
                        case 2 :
                            System.out.println("Dikdortgen cevre : " + String.format("%.2f",dikdortgen.cevreHesapla(kisaKenar, uzunKenar)));
                            break;
                        default:
                            System.out.println("Gecersiz secim yaptiniz.");
                            break;
                    }
                    break;
            case 3:
                System.out.print("Yapmak istediginiz hesaplamayi seciniz.\n1 = Alan Hesapla \t2 = Cevre Hesaplama : ");
                int sayi2 = input.nextInt();
                System.out.print("Ucgenin 1.kenar uzunlugunu giriniz : ");
                double birinciKenar = input.nextDouble();
                System.out.print("Ucgenin 2.kenar uzunlugunu giriniz : ");
                double ikinciKenar = input.nextDouble();
                System.out.print("Ucgenin 3.kenar uzunlugunu giriniz : ");
                double ucuncuKenar = input.nextDouble();

                switch (sayi2){
                    case 1:
                        System.out.println("Ucgen alani : " + String.format("%.2f",ucgen.ucgenAlan(birinciKenar,ikinciKenar,ucuncuKenar)));
                        break;
                    case 2:
                        System.out.println("Ucgen cevresi : " + String.format("%.2f",ucgen.ucgenCevre(birinciKenar, ikinciKenar, ucuncuKenar)));
                        break;
                    default:
                        System.out.println("Gecersiz secim yaptiniz.");
                        break;
                }
                break;
            case 4:
                System.out.print("Yapmak istediginiz hesaplamayi seciniz.\n1 = Alan Hesapla \t2 = Cevre Hesaplama : ");
                int sayi3 = input.nextInt();
                System.out.print("Cemberin yaricapini giriniz : ");
                double yaricap = input.nextDouble();
                    switch (sayi3){
                        case 1 :
                            System.out.println("Cemberin alani : " + String.format("%.2f", (cember.alanHesapla(yaricap))));
                            break;
                        case 2 :
                            System.out.println("Cemberin cevresi : " + String.format("%.2f", cember.cevreHesapla(yaricap)));

                            break;
                        default:
                            System.out.println("Gecersiz secim yaptiniz.");
                            break;
                    }
                    break;
            default:
                System.out.println("Gecersiz secim yaptiniz.");
                break;
        }


    }

}
