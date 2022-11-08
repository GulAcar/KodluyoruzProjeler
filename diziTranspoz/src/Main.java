import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[][] list={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Transpozu alınacak dizi: ");
        for (int i = 0; i < list.length ; i++) {
            for (int j = 0; j < list.length ; j++) {
                System.out.print(list[i][j]);
            }
            System.out.println();
        }
        System.out.println("Dizinin transpozu: ");
        for (int i = 0; i < list.length ; i++) {
            for (int j = 0; j < list.length ; j++) {
                System.out.print(list[j][i]);
            }
            System.out.println();
        }

    }
}