import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int n,k,j ;
        System.out.print("SAyi giriniz:");
        n=input.nextInt();

        System.out.println("4 un Kuvvetleri :");
        for (k = 1; k <= n;k *= 4) {
            System.out.println(k);
        }System.out.println("--------------");
        System.out.println("5 in Kuvvetleri :");
        for (j = 1; j <= n;j *= 5) {
            System.out.println(j);
        }








    /*
     girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran
     */

    }
}
