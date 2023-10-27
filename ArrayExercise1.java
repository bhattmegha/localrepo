package LocalRepo;

import java.util.Scanner;

public class ArrayExercise1 {
    //take array size and input value from user and for value x, print it's index number
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int number[]=new int[size];

        for(int i=0;i<size; i++){
            number[i]=sc.nextInt();
            
        }
        int x= sc.nextInt();
        for(int i=0;i<number.length;i++){   //number.length=size
            if(number[i]==x){
                System.out.println("x found at" + i);
            }
            
        }

    }
}
