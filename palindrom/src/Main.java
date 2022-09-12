public class Main {
    static boolean pal(int number){
     int temp=number, ret=0, lastNum;
     while(temp!=0){

         lastNum=temp%10;
         System.out.println("son basamak"+lastNum);
         ret=(ret*10)+lastNum;
         System.out.println("yenisayi"+ret);
         temp/=10;
         System.out.println("sayi"+temp);
     }
     if (number==ret){
        return true;
     }
     else {
         return false;
     }
    }
    public static void main(String[] args) {
        System.out.println(pal(456567));
    }


}