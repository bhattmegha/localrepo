package LocalRepo;

import java.util.Scanner;

public class TableFunction {
    
    public static void printTable(int n){

        for(int i=1; i<=10;i++){
            int table = n*i;
            System.out.println(table);
        }
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        printTable(n);
    }
}
