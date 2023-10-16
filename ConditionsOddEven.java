package LocalRepo;
import java.util.*;

//checking Odd or EVen by taking input from user
public class ConditionsOddEven {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num%2 == 0){

            System.out.println("Even number");
        }else {

            System.out.println("Odd Number");
        }


    }



}
