import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int [] list={ 1,3,5,6,7,9,12,34,54,23,67,2,22};
    double sum=0.0;
        for(double i: list) {
            sum+=1/i;

        }
        double avarage=sum/list.length;
        System.out.println(avarage);
    }
}