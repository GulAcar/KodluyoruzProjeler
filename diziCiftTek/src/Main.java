import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value){
        for (int i:arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list={12,32,33,56,2,5,63,22,15,21,41,26,44,82,100,55,78,90};
        int[] ciftt= new int[list.length];
        int[] tek=new int[list.length];
        int startIndex=0;
        for (int i = 0; i < list.length ; i++) {
                if (list[i]%2 ==0) {
                    ciftt[i]=list[i];
                }else {
                    tek[i]=list[i];
                    System.out.print(tek[i]+",");
                }


        }
        System.out.println();
        for (int value:ciftt) {
            if (value!=0){
                System.out.print(value+",");
            }
        }
        }
    }
