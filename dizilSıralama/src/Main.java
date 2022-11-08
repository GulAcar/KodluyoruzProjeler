import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int eleman;
        int sayac;
        System.out.println("Dizi için eleman sayısı giriniz: ");
        eleman=input.nextInt();
        int[] list = new int[eleman];
        for (int i = 0; i <list.length ; i++) {
            System.out.print(i+". elemanı gir:");
            list[i] = input.nextInt();

        }
        for (int j = 0; j < list.length ; j++) {
            System.out.println(j+". elemanı: "+list[j]);
        }
        Arrays.sort(list);
        System.out.println("Dizinin Küçükten büyüğe sıralanışı:"+Arrays.toString(list));
    }
}