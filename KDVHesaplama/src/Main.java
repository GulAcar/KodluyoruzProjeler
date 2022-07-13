import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        double fiyat, toplam ,kdv,Kfiyat;
        System.out.println("Fiyat giriniz:");
        Scanner input= new Scanner(System.in);
        fiyat=input.nextDouble();

        if(fiyat>0 && fiyat<1001){
            kdv=1.18;
            Kfiyat=fiyat*kdv;
            System.out.println("ürünün kdvli fiyatı:"+Kfiyat);
        }
        else if(fiyat>1000){
            kdv=1.08;
            Kfiyat=fiyat*kdv;
            System.out.println("ürünün kdvli fiyatı:"+Kfiyat);
        }
        else{
            System.out.println("Girilen fiyat hatalıdır!");
        }


    }
}
/*
         KDV'siz Fiyat = 10;
         KDV'li Fiyat = 11.8;
         KDV tutarı = 1.8;
         0 ve 1000 TL arasında ise KDV oranı %18
         tutar 1000 TL'den büyük ise KDV oranını %8

 */