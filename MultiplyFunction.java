package LocalRepo;

import java.util.Scanner;

public class MultiplyFunction {
    
    public static int calculateMul (int a,int b){
       int product = a*b;
       return product;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();

        int product=calculateMul(a, b);
        System.out.println(product);

    }

}
