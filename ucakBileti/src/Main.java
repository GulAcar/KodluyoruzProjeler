import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int age, mesafe, yon ;
        double Tfiyat, iFiyat ,bilet=10, indirim;
        Scanner input=new Scanner(System.in);
        System.out.println("Gideceğiniz mesafeyi giriniz:");
        mesafe=input.nextInt();
        if(mesafe<=0){
            System.out.println("Hatalı giriş yaptınız");
        }
        else {
            System.out.println("Yasınızı giriniz:");
            age = input.nextInt();
            if(age<=0){
                System.out.println("Hatalı giriş yaptınız");
            }
            else {
                if (age<=12 && age>0) {
                    System.out.println("Yolculuk tipinizi seçiniz:\n 1-Tekyön \n 2-Gidiş-Dönüş");
                    yon = input.nextInt();
                    switch (yon) {
                        case 1:
                            Tfiyat = (mesafe * 0.10) + bilet;
                            System.out.println("Toplam ücre:" + Tfiyat);
                            indirim=Tfiyat*0.5;
                            iFiyat=Tfiyat-indirim;
                            System.out.println("İndirimli fiyat:"+iFiyat);
                            break;
                        case 2:
                            Tfiyat = (mesafe * 0.10) + bilet * 2;
                            System.out.println("Toplam ücret:" + Tfiyat);
                            indirim=Tfiyat*0.5;
                            iFiyat=Tfiyat-indirim;
                            System.out.println("İndirimli fiyat:"+iFiyat);
                            break;
                        default:
                            System.out.println("Hatalı giriş yaptınız!");
                            break;
                    }
                }
                else if(age>12 && age<=24){
                    System.out.println("Yolculuk tipinizi seçiniz:\n 1-Tekyön \n 2-Gidiş-Dönüş");
                    yon = input.nextInt();
                    switch (yon) {
                        case 1:
                            Tfiyat = (mesafe * 0.10) + bilet;
                            System.out.println("Toplam ücre:" + Tfiyat);
                            indirim=Tfiyat*0.1;
                            iFiyat=Tfiyat-indirim;
                            System.out.println("İndirimli fiyat:"+iFiyat);
                            break;
                        case 2:
                            Tfiyat = (mesafe * 0.10) + bilet * 2;
                            System.out.println("Toplam ücret:" + Tfiyat);
                            indirim=Tfiyat*0.1;
                            iFiyat=Tfiyat-indirim;
                            System.out.println("İndirimli fiyat:"+iFiyat);
                            break;
                        default:
                            System.out.println("Hatalı giriş yaptınız!");
                            break;
                    }

                }
                else if(age>=65){
                    System.out.println("Yolculuk tipinizi seçiniz:\n 1-Tekyön \n 2-Gidiş-Dönüş");
                    yon = input.nextInt();
                    switch (yon) {
                        case 1:
                            Tfiyat = (mesafe * 0.10) + bilet;
                            System.out.println("Toplam ücre:" + Tfiyat);
                            indirim=Tfiyat*0.3;
                            iFiyat=Tfiyat-indirim;
                            System.out.println("İndirimli fiyat:"+iFiyat);
                            break;
                        case 2:
                            Tfiyat = (mesafe * 0.10) + bilet * 2;
                            System.out.println("Toplam ücret:" + Tfiyat);
                            indirim=Tfiyat*0.3;
                            iFiyat=Tfiyat-indirim;
                            System.out.println("İndirimli fiyat:"+iFiyat);
                            break;
                        default:
                            System.out.println("Hatalı giriş yaptınız!");
                            break;
                    }
                }
                else if(age>24 && age<65){
                    System.out.println("Yolculuk tipinizi seçiniz:\n 1-Tekyön \n 2-Gidiş-Dönüş");
                    yon = input.nextInt();
                    switch (yon) {
                        case 1:
                            Tfiyat = (mesafe * 0.10) + bilet;
                            System.out.println("Toplam ücre:" + Tfiyat);
                            break;
                        case 2:
                            Tfiyat = (mesafe * 0.10) + bilet * 2;
                            System.out.println("Toplam ücret:" + Tfiyat);
                            indirim=Tfiyat*0.2;
                            iFiyat=Tfiyat-indirim;
                            System.out.println("İndirimli fiyat:"+iFiyat);
                            break;
                        default:
                            System.out.println("Hatalı giriş yaptınız!");
                            break;
                }
                else{
                    System.out.println("Hatalı giriş yaptınız");
                }

            }
        }
    }
}


/*
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

 */