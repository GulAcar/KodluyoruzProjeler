import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp= new Scanner(System.in);

        //kullanıcıdan değer alma
        System.out.print("matematik notunuz:");
        mat= inp.nextInt();

        System.out.print("fizik notunuz:");
        fizik= inp.nextInt();

        System.out.print("Kimya notunuz:");
        kimya= inp.nextInt();

        System.out.print("Turkce notunuz:");
        turkce= inp.nextInt();

        System.out.print("tarih notunuz:");
        tarih= inp.nextInt();

        System.out.print("muzik notunuz:");
        muzik= inp.nextInt();

        int toplam =(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc;
        sonuc=toplam/6.0;
        System.out.println("ortalamanız:"+ sonuc);
         if(sonuc>0 && sonuc<40){
             System.out.println("kaldınız");
         }
         else if (sonuc>39 && sonuc<60) {
             System.out.println("sorumlu gectınız");
         }
         else if(sonuc>59 && sonuc<100){
             System.out.println("Geçtiniz");
        }
         else{
             System.out.println("geçersiz not");
        }


    }



}