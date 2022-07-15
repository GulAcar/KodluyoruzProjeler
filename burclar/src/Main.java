import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int day,mouth;
        Scanner input= new Scanner(System.in);
        System.out.println("Dogum ayınız:");
        mouth=input.nextInt();
        System.out.println("Doğum gününzü giriniz:");
        day=input.nextInt();

        if((mouth==1&& day>=22) || (mouth==2 && day<=19) ){
            System.out.println("Burcunuz: Kova");
        }
        else if ((mouth==2 && day>=20) || (mouth==3 && day<=20)){
            System.out.println("Burcunuz: Balık");
        }
        else if ((mouth==3 && day>=21) || (mouth==4 && day<=20)){
            System.out.println("Burcunuz: Koç");
        }
        else if ((mouth==4 && day>=21) || (mouth==5 && day<=21)){
            System.out.println("Burcunuz: Boğa");
        }
        else if ((mouth==5 && day>=22) || (mouth==6 && day<=22)){
            System.out.println("Burcunuz: İkizler");
        }
        else if ((mouth==6 && day>=23) || (mouth==7 && day<=22)){
            System.out.println("Burcunuz: Yengeç");
        }
        else if ((mouth==7 && day>=23) || (mouth==8 && day<=22)){
            System.out.println("Burcunuz: Aslan");
        }
        else if ((mouth==8 && day>=23) || (mouth==9 && day<=22)){
            System.out.println("Burcunuz: Başak");
        }
        else if ((mouth==9 && day>=23) || (mouth==10 && day<=22)){
            System.out.println("Burcunuz: Terazi");
        }
        else if ((mouth==10 && day>=23) || (mouth==11 && day<=22)){
            System.out.println("Burcunuz: Akrep");
        }
        else if ((mouth==11 && day>=23) || (mouth==12 && day<=21)){
            System.out.println("Burcunuz: Yay");
        }
        else if ((mouth==12 && day>=22) || (mouth==1 && day<=21)){
            System.out.println("Burcunuz: Oğlak");
        }
        else{
            System.out.println("hatalı giriş yaptınız!");
        }

    }
}
/*
Oğlak Burcu : 22 Aralık - 21 Ocak


 */