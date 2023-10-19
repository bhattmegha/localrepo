package LocalRepo;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean Prime = true;

        for(int i=2; i<n; i++){
            if(n%i==0){
                Prime = false;
                System.out.println("is not a prime number");
                break;
            }
                    
        }
        System.out.println(Prime);
        
    }
}
