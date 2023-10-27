package LocalRepo;

import java.util.Scanner;

public class ArrayExercise2 {
    
    public static void main(String args[]){
        //Taking only names as input from users and defining the size of array on our own
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //String name = sc.nextLine();
        //String name2 = sc.nextLine();
        //String name3 = sc.nextLine();

        //String Names[] = new String[3];
        // Names[0] = name1;
        // Names[1] = name2;
        // Names[2] = name3;
        // //System.out.println(Names);
        // for(int i=0; i<Names.length; i++){
        //     System.out.println(Names[i]);
        // }

        //Taking Names and Size of an array as an input
            
        String Names[] = new String[size];

        for(int i=0; i<size; i++){
             Names[i] = sc.next();
        }

        //output

        for(int i=0; i<Names.length; i++){
            System.out.println(Names[i]);
        }
    }
}
