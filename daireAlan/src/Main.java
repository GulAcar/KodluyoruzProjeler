import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double r,a,sonuc,pi=3.14;
        Scanner girdi= new Scanner(System.in);
        System.out.println("Dairenin yarıcapını giriniz");
        r=girdi.nextDouble();
        System.out.println("daire dilimin açısını giriniz");
        a=girdi.nextDouble();
        sonuc=(pi*(r*r)*a)/360;
        sonuc=(a<360)?sonuc:sonuc;
        System.out.println("daire diliminin alanı:"+sonuc);
        sonuc=(a>360)?0:sonuc;
        System.out.println("hata!");
    }
}
/*
       Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
       𝜋 sayısını = 3.14 alınız.
       Formül : (𝜋 * (r*r) * 𝛼) / 360
 */