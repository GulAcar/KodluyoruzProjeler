import java.util.Scanner;
public class Main {
    static boolean asal(int n){
        int sayac=1;
        for (int i = 1; i < n; i++) {
            int kalan=n%i;
            if (kalan == 0) {
                sayac++;
            }
        }
        if (sayac == 2) {
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);

        System.out.println("Bir sayi giriniz:");
        int n=scan.nextInt();
        if (n<1) {
            System.out.println("Hatalı giriş yaptınız!");
        }
        else {
            System.out.println(asal(n));
        }
    }
}