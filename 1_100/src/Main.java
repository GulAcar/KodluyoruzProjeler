import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //int n1;
        Scanner input = new Scanner(System.in);
        //System.out.println("Sayi giriniz: ");
        //n1 = input.nextInt();
        String asalSayilar = "";
        for (int i=0 ; i<=100; i++) {
            int sayac = 0;
            for (int j = i; j >= 1; j--) {
                if ( i%j ==0) {
                    sayac++;
                }
            }
            if (sayac==2){
                asalSayilar = asalSayilar + i + " ";
            }
            System.out.println(asalSayilar);
        }


    }
}
