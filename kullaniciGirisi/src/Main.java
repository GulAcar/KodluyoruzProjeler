import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String kulAdi, sifre,ySifre;
        Scanner input=new Scanner(System.in);
        System.out.println("Kullanıcı adınız giriniz:");
        kulAdi=input.nextLine();
        System.out.println("Şifrenizi giriniz:");
        sifre=input.nextLine();

        if(kulAdi.equals("admin")&& sifre.equals("admin123")){
            System.out.println("Kullanıcı adı ve siifreniz doğru!");
        }
        else {
            System.out.println("hatalı giris yaptınız!\n"+
                    "Sifrenizi değiştirmek ister misiniz? Evet için '1'/Hayır için '2' ye basınız.");
            int secim=input.nextInt();
            input.nextLine();


            switch(secim){
                case 1:
                    System.out.println("yeni şifrenizi giriniz:");
                    ySifre=input.nextLine();
                    if(sifre.equals("admin123")&& ySifre.equals(ySifre)){
                        System.out.println("esski sifre ve yeni sifre aynı olamaz");

                    }
                    else {
                        System.out.println("Sifreniz değiştirildi");
                    }
                    break;
                case 2:
                    System.out.println("Sifreniz değişmedi");
                    break;

            }
        }
    }
}