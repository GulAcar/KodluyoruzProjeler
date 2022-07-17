import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int sayi, top = 0;
        boolean n;
        Scanner input = new Scanner(System.in);
        boolean tekMi = true;
        do {
            System.out.print("sayı giriniz:");
            sayi = input.nextInt();
            if (sayi % 2 == 1) {
                tekMi = false;
                break;
            }
            top = top + sayi;

        }

        while (tekMi);

        System.out.print("toplam:" + top);




    /*
    Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
    girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana
     */

    }
}
