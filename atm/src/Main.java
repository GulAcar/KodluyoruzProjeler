import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kulAdi, sifre;
        int select;
        int bakiye=500;
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz : ");
        kulAdi=input.nextLine();
        System.out.println("Sifrenizi giriniz : ");
        sifre=input.nextLine();

        if (kulAdi.equals("gul")&&sifre.equals("gul123")) {
            System.out.println("basarılı giris yaptınız");
            System.out.println("1-Para yatırma\n" +
                    "2-Para Çekme\n" +
                    "3-Bakiye Sorgula\n" +
                    "4-Çıkış Yap");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
            select = input.nextInt();
            switch (select){
                case 1:
                    System.out.println("eklenecek tutar:");
                    int pyatırma=input.nextInt();
                    bakiye+=pyatırma;
                    System.out.println("toplam bakiye="+bakiye);
                    break;
                case 2:
                    System.out.println("Cekeceğiniz paraa miktari=");
                    int pcekme=input.nextInt();
                    bakiye-=pcekme;
                    System.out.println("mevcut bakiye="+bakiye);
                    break;
                case 3:
                    System.out.println("bakiyeniz"+bakiye);
                    break;
                case 4:
                    System.out.println("cıkıs yaptınız");
                    break;
                default:
                    System.out.println("hatalı giris yaptınız");
                    break;

            }

        }
        else{
            System.out.println("hatalı giris yaptınız");
        }
    }
}