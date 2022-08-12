import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int a, deger1 = 0, deger2 = 0, max = 1, min = 1;
        Scanner inp = new Scanner(System.in);
        System.out.println("Lutfen kac deger gireceginizi seciniz:");
        a = inp.nextInt();
        for (int i = 1; i <= a; i++) {
            if (i <= a) {
                if (i % 2 == 1) {
                    System.out.println(i + ". degeri giriniz:");
                    deger1 = inp.nextInt();
                } else if (i % 2 == 0) {
                    System.out.println(i + ".degeri giriniz:");
                    deger2 = inp.nextInt();
                }
            }
            if (i >= 2) {
                if (deger2 < deger1) {
                    max = deger1;
                    min = deger2;
                } else if (deger1 < deger2) {
                    max = deger2;
                    min = deger1;
                }
            }
        }
        System.out.println("en buyuk deger=" + max);
        System.out.println("en kucuk deger=" + min);
    }
}