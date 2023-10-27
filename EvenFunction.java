package LocalRepo;

import java.util.Scanner;

public class EvenFunction {
    public static void evenNumber(int n){
        if(n%2==0){
            System.out.println("even number");

        }else{
            System.out.println("Odd number");
        }
 
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        evenNumber(n);
    }

}
