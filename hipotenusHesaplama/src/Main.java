import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double a, b, c, cevre, alan,u;
        Scanner girdi= new Scanner(System.in);
        System.out.println("1. kenar uzunlugunu giriniz:");
        a=girdi.nextDouble();
        System.out.println("2. kenar uzunlugunu giriniz:");
        b=girdi.nextDouble();
        System.out.println("3. kenar uzunlugunu giriniz:");
        c=girdi.nextDouble();

        cevre=a+b+c;
        u=(a+b+c)/2;
        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("ucgenin cevresi:"+cevre);
        System.out.println("ucgenin alanı:"+alan);

    }
}
/*
         Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
         𝑢 = (a+b+c) / 2
         Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐
 */