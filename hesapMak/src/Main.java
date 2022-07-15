import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a,b,sonuc,secim;
        Scanner input= new Scanner(System.in);
        System.out.println("A sayısını giriniz");
        a=input.nextInt();
        System.out.println("B sayısını giriniz:");
        b=input.nextInt();

        System.out.println("1-toplama\n 2-cikarma\n 3-bolme\n 4-carpma\n ");
        System.out.println("seçiminiz:"  );
        secim=input.nextInt();

        switch(secim){
            case 1:
                sonuc=a+b;
                System.out.println("Sayıların toplamı:"+ sonuc);
                break;
            case 2:
                sonuc=a-b;
                System.out.println("sayıların farkı:"+ sonuc);
                break;
            case 3:
                sonuc=a/b;
                System.out.println("SAyıların bolumu:"+ sonuc);
                break;
            case 4:
                sonuc=a*b;
                System.out.println("sayıların carpımı:"+ sonuc);
                break;
            case 5:
                System.out.println("yanlıs deger girdiniz!");
                break;
        }

    }
}