import java.util.Scanner;
public class Main {
    static int decreaseIncreaseBy5(int number) {
        System.out.print(number + " ");
        if (number <= 0) return number;
        decreaseIncreaseBy5(number - 5);
        System.out.print(number + " ");
        return number;
    }

    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz:");
        int n=scan.nextInt();
        System.out.println(decreaseIncreaseBy5(n));

    }
}