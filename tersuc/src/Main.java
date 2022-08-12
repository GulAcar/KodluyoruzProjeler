import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        n1 = input.nextInt();
        for (int i=n1-1 ; i >=1; i--) {
            for (int j = 1; j <= n1-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k<=(2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
