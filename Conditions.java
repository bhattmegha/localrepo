package LocalRepo;

import java.util.*;

//by taking input from user 
public class Conditions {

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >20){

            System.out.println("Adult");
        }
        else{

            System.out.println("Not Adult");
        }
    }
    
}
