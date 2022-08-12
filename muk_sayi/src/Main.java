import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kulAdi, sifre;
        int sayi, sonuc = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        sayi = input.nextInt();

        //2p−1(2p−1)
        // sonuc=Math.abs(2^(sayi-1)*(2*sayi-1));

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                sonuc += i;
                System.out.println("sonuç:" + sonuc);
            }
        }

            if (sonuc == sayi) {
                System.out.println("Mükemmel SAYİ !!");

            } else if (sonuc != sayi) {

                System.out.println("mükemmel sayi değildir");
            } else {

                System.out.println("yanlış değer girdiniz!!");
            }


        }
    }
