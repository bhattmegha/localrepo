package LocalRepo;

import java.util.Scanner;

public class Primenumberfunction {
    
    public static void checkPrimeNumber(int n){
        boolean prime = true;
        for(int i=2; i<n; i++){
            if(n%i==0){
                prime=false;
                System.out.println("not a prime number");
                break;
            }
            
        }
        System.out.println(prime);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        checkPrimeNumber(n);
    }
}
