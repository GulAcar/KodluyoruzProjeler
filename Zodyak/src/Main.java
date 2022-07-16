import java.util.Scanner;public class Main {

    public static void main(String[] args) {

        int yil,zodyak;
        Scanner input=new Scanner(System.in);
        System.out.println("Doğum yılının giriniz:");
        yil=input.nextInt();

        zodyak=yil%12;
        switch(zodyak){

            case 0:
                System.out.println("çin zodyağınız: Maymun");
                break;
            case 1:
                System.out.println("çin zodyağınız: Horoz");
                break;
            case 2:
                System.out.println("çin zodyağınız: Köpek");
                break;
            case 3:
                System.out.println("çin zodyağınız: Domuz");
                break;
            case 4:
                System.out.println("çin zodyağınız: Fare");
                break;
            case 5:
                System.out.println("çin zodyağınız: Öküz");
                break;
            case 6:
                System.out.println("çin zodyağınız: Kaplan");
                break;
            case 7:
                System.out.println("çin zodyağınız: Tavşan");
                break;
            case 8:
                System.out.println("çin zodyağınız: Ejderha");
                break;
            case 9:
                System.out.println("çin zodyağınız: Yılan");
                break;
            case 10:
                System.out.println("çin zodyağınız: At");
                break;
            case 11:
                System.out.println("çin zodyağınız: Koyun");
                break;
            default:
            System.out.println("hatalı giriş yaptınız!");
        }


    }
}
/*

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun
 */