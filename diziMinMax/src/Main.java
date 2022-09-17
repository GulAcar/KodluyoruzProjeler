import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int [] list={ 1,-3,5,6,-7,9,12,34,54,-23,67,2,22};
    //max 67 min -23
        int min=list[0];
        int max=list[0];
        for (int i: list) {
            if (i<min) {
                min=i;
            }
            if (i>max) {
                max=i;
            }
        }
        System.out.println("Minimum değer: "+min);
        System.out.println("Maximum değer: "+max);
    }
}