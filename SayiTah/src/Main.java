import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //double number= Math.random()*100;
        Random rand=new Random();
        int number=rand.nextInt(100);
        
        Scanner input=new Scanner(System.in);
        int right=0;
        int selected;
        int[] wrong=new int[5];
        boolean isWİn=false;
        boolean isWrong=false;
        //System.out.println(number);
        while (right<5){
            System.out.println("Tahminizi girin:");
            selected= input.nextInt();
            if(selected<0 || selected>99){
                System.out.println("0-100 arasında sayi giriniz!");
                if(isWrong){
                    right++;
                    System.out.println("Hatalı giriş yaptınız. Kalan hak:"+(5-right));
                }else {
                    isWrong=true;
                    System.out.println("Tekrar hayalı girişinizde hakkınızdan eksilecektir.");
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler odğru giriş yaptınız! Girilen sayi:"+number);
                isWİn=true;
                break;

            }else {

                System.out.println("hatalı bir sayı girdiniz.");
                if (selected> number){
                    System.out.println(selected+" sayisi, girilen sayıdan büyüktür!");
                }else{
                    System.out.println(selected+" sayisi, girilen sayıdan küçüktür!");
                }
                wrong[right++]=selected;
                System.out.println("Kalan hak:"+(5-right));
            }
        }
        if (!isWİn){
            System.out.println("LOSER!");
            if(!isWrong){
                System.out.println("Tahminleriniz:"+ Arrays.toString(wrong));
            }
            System.out.println("Doğru sayı: "+ number);
        }
    }
}