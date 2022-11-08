import java.util.Scanner;
public class Main {
    static int sum(int a,int b){
        int resault= a+b;
        System.out.println("Toplam"+resault);
        return resault;
    }
    static int minus(int a,int b) {
        int result = a - b;
        System.out.println("Cıkarma" + result);
        return result;
    }
    static int times(int a,int b) {
        int result = a * b;
        System.out.println("Carpım" + result);
        return result;
    }
    static int divided(int a,int b) {
        int result = a / b;
        System.out.println("Bölüm" + result);
        return result;
    }
    static int power(int a,int b) {
        int result = 1;

        for (int i = 1; i <b; i++) {
            result *=a;
        }
        return result;
    }
    static int mod(int a,int b) {
        int result = a % b;
        System.out.println("MOD:" + result);
        return result;
    }
    static void calc(int a,int b) {
        System.out.println("Dikdörgen cevresi:" + (2*(a+b)));
        System.out.println("Dikdörtgen alanı:"+ (a*b));

    }

    public static void main(String[] args) {

        int select;
        Scanner input= new Scanner(System.in);

        String menu= "1-toplama\n 2-cikarma\n 3-carpma\n 4-Bölme\n 5-us alma\n 6-mod alma\n" +
                "7-Dikdörgen alan ve cevre hessabı\n 8-Cıkıs\n";
        System.out.println(menu);

        while (true){

            System.out.println("seçiminiz:"  );
            select=input.nextInt();
            if (select == 0) {
                break;
            }

            System.out.println("A sayısını giriniz");
            int a=input.nextInt();
            System.out.println("B sayısını giriniz:");
            int b=input.nextInt();
            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    System.out.println("Us alma:"+power(a,b));
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    calc(a,b);
                    break;
                case 8:
                    System.out.println("Cıkıs yaptınız");
                default:
                    System.out.println("hatalı seçim yaptınız!");
            }
        }


    }
}