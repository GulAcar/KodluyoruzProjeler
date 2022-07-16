import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int sayi, mod;
        Scanner input = new Scanner(System.in);
        System.out.print("1.sayıyı girin:");
        sayi=input.nextInt();

        for(int i=0; i<=sayi; i++){
            if(i%3==0){
                if(i%4==0){
                    System.out.println("3 e v3 4 e tam bölünen sayılar:"+i);
                    double ort,toplam;
                    toplam=i+i;
                    ort=toplam/sayi;
                    System.out.println("Sayıların ortalaması:"+ort);
                }
            }
        }



    }
    /*
    3 ve 4'e tam bölünen sayıların ortalamasını
     */

}
