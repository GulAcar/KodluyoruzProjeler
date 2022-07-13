import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner girdi=new Scanner(System.in);
        double km,ucret,tm=2.20;
        System.out.println("mesafeyi km cinsinden giriniz");
        km=girdi.nextDouble();
        ucret=(km*tm)+10;

        ucret=(ucret<21)?20:ucret;
        System.out.println("verilmesi greken ucret"+ ucret);

    }
}
/*
       Taksimetre KM başına 2.20 TL tutmaktadır.
       Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
       Taksimetre açılış ücreti 10 TL'dir.
 */