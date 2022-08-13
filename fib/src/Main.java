import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1,a=0,b=1,c;
        Scanner input = new Scanner(System.in);
        System.out.println("kac adım gitsin?");
        n1 = input.nextInt();

        System.out.print(a+" "+b);

        for(int i=2;i<n1;++i)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
        System.out.println();
    }

}


