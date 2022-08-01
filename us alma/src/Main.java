import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int k,n,top=1;
        System.out.print("Üssü alınacak sayi giriniz:");
        k=input.nextInt();
        System.out.print("Üs degereini  giriniz:");
        n=input.nextInt();
        for(int i=1;i<=n;i++){
            top=top*k;
            System.out.println("sayının faktoruyeli:"+ top);
        }


        }


    /*
             4^5= 4*4*4*4*4
     */

    }

