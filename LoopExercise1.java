package LocalRepo;
import java.util.*;
//printing sum of first n natural numbers; taking input n from user
public class LoopExercise1 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            
        }
        System.out.println(sum);
    }
}
