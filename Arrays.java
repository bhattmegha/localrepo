package LocalRepo;

import java.util.Scanner;

public class Arrays {
    
    public static void main(String args[]){
            //taking size of array from user
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] marks = new int[size];
        // marks[0] = 97;
        // marks[1]= 98;
        // marks[2]= 100;

       // System.out.println(marks[2]);

        //printing using for loop

        //taking Array value as input from user

        for(int i=0; i<size;i++){
            marks[i]=sc.nextInt();
        }

        for(int i=0; i<size; i++){
            System.out.println(marks[i]);
        }
    }

}
