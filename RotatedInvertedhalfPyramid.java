package LocalRepo;

public class RotatedInvertedhalfPyramid {
    public static void main(String args[]){
        int n=4;
        //outer loop
        for(int i=1; i<=n; i++){
            //printing spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");

            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


}
