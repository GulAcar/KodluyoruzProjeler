import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        System.out.println("Enter the number:");
        int number = input.nextInt();
        while (number != 0) {
            total += (number%10);
            number /=10 ;
        }
        System.out.println(total);
    }
}