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
        System.out.println("ucgenin alanΔ±:"+alan);

    }
}
/*
         ΓΓ§πππππ Γ§ππ£πππ π = 2π’
         π’ = (a+b+c) / 2
         Alan * Alan = π’ * (π’ β π)* (π’ β π) * (π’ β π
 */