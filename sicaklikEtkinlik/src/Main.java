import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int sicaklik;
        Scanner input=new  Scanner(System.in);
        System.out.println("Sıcaklık giriniz:");
        sicaklik=input.nextInt();
        System.out.println("Hadi etkinlik seçelim.");
        if(sicaklik<5){
            System.out.println("Kayak yapabilirsin");
        }
        else if (sicaklik>=5 || sicaklik<=15) {
            System.out.println("Sinamaya gidebilirsin");

        }
        else if (sicaklik>15 || sicaklik<=25){
            System.out.println("Piknik yapmak için hava çok güzel");
        }
        else if (sicaklik>25){
            System.out.println("Bugün yüzmek için hava harika hadi yüzmeye gidelim");
        }
        else{
            System.out.println("Hatalı giriş yaptınız!");
        }
    }
}
/*
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 */