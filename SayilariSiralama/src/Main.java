import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int a,b,c;
        Scanner input=new  Scanner(System.in);
        System.out.println("A sayısınını giriniz:");
        a=input.nextInt();
        System.out.println("B sayisini giriniz:");
        b= input.nextInt();
        System.out.println("C sayisini giriniz:");
        c=input.nextInt();

        if((a>b) && (a>c)){
            if (b>c){
                System.out.println("büyükten küçüğe: "+a+">"+b+">"+c);
            }
            else {
                System.out.println("büyükten küçüğe: "+a+">"+c+">"+b);
            }
        }
        else if ((b>a)&& (b>c)) {
            if (a>c){
                System.out.println("büyükten küçüğe: "+b+">"+a+">"+c);
            }
            else {
                System.out.println("büyükten küçüğe: "+b+">"+c+">"+a);
            }

        }
        else if((c>a)&& (c>b)){
            if (a>b){
                System.out.println("büyükten küçüğe: "+c+">"+a+">"+b);
            }
            else{
                System.out.println("büyükten küçüğe: "+c+">"+b+">"+a);
            }
        }
    }
}
/*
     Girilen 3 sayıyı "küçükten büyüğe" sıralayanız
 */