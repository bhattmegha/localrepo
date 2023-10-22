package LocalRepo;

import java.util.Scanner;

//print sum of two numbers input from user

public class Functions {
    
    public static int calculateSum(int a, int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int a= sc.nextInt();
int b = sc.nextInt();

int sum= calculateSum(a, b);  //creating sum variable for main function
System.out.println(sum);



    }

}
