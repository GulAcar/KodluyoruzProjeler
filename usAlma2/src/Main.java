import java.util.Scanner;
public class Main {
    static int power(int a,int b) {
        int result = 1;

        for (int i = 1; i <=b; i++) {
            result *=a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("ilk sayıyı giriniz:");
        int a=scan.nextInt();
        System.out.println("Üs değerini  giriniz:");
        int b=scan.nextInt();
        System.out.println(power(a,b));
    }
}