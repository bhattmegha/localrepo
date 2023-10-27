package LocalRepo;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rowsize = sc.nextInt();
        int columnsize = sc.nextInt();

        int[][] numbers = new int[rowsize][columnsize];
        
        for(int i=0; i<rowsize; i++){
            for(int j=0; j<columnsize; j++){
                numbers[i][j] = sc.nextInt();

            }
            
        }
        int x = sc.nextInt();
        for(int i=0; i<rowsize; i++){
            for(int j=0;j<columnsize; j++){
                if(numbers[i][j] == x){
                    System.out.println("X found at" + i +","+ j);
                }
                
            }
            //System.out.println();
        }

        // for(int i=0; i<numbers.length; i++){
        //     if(numbers[i][j]==x){
        //         System.out.println(i,j);
        //     }
        // }

    }
    
}
