import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner girdi=new Scanner(System.in);
        double boy, kilo, index;
        System.out.println("lutfen boyunuzu metre cinsinden giriniz");
        boy=girdi.nextDouble();
        System.out.println("kilonuzu giriniz:");
        kilo=girdi.nextDouble();

        index=Math.sqrt(kilo/boy*boy);
        System.out.println("killo boy indeksiniz:"+index);


    }
}
/*
     Kilo (kg) / Boy(m) * Boy(m)
 */