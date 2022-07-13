import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner girdi=new Scanner(System.in);
        double armut=2.14,armutkg,
                elma=3.67,elmakg,
                dom=1.11, domkg,
                muz=0.95,muzkg,
                pat=5, patkg,
                toplam;

        System.out.println("Ne kadar armut alacaksınız?");
        armutkg=girdi.nextDouble();
        System.out.println("Ne kadar elma alacaksınız?");
        elmakg=girdi.nextDouble();
        System.out.println("Ne kadar domates alacaksınız?");
        domkg=girdi.nextDouble();
        System.out.println("Ne kadar muz alacaksınız?");
        muzkg=girdi.nextDouble();
        System.out.println("Ne kadar patlıcan alacaksınız?");
        patkg=girdi.nextDouble();

        toplam=(armut*armutkg)+(elma*elmakg)+(dom*domkg)+(muz*muzkg)+(pat*patkg);
        System.out.println("Toplam ücret:"+ toplam);

    }
}
/*
         Armut : 2,14 TL
         Elma : 3,67 TL
         Domates : 1,11 TL
         Muz: 0,95 TL
         Patlıcan : 5,00 TL
 */