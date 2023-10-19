package LocalRepo;

public class solidRectangle {
    
    public static void main(String args[]){
        int n=4;
        int m=5;
//defining outer loop
        for (int i=1; i<=n; i++){
            //defining inner loop
            for(int j=1; j<=m;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
