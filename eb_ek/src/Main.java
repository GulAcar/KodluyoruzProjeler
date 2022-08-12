import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi1, sayi2;
        int ebob = 1,ekok;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        sayi1 = input.nextInt();
        System.out.println("Sayi giriniz: ");
        sayi2 = input.nextInt();

        for (int i = 1; i <= sayi1; i++) {
            if (sayi1%i == 0 && sayi2%i ==0) {
                ebob=i;

            }

        }
        System.out.println(ebob);
        System.out.println("----------------------------");
        for (int i = 0; i <=(sayi1*sayi2) ; i++) {
            if (i% sayi1  ==0 && i% sayi2 ==0) {
                System.out.println("ekok:"+i);
                
            }
            
        }


    }
}
