public class Right_InvertedHollowTriangle {

    public static void main(String[] args) {
        int n=5;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=i-1; j++ )
            System.out.print("   ");

            for(int k=1; k<=(n-(i-1)); k++){
                 if(i==1 || k==1 || k==n-(i-1) )
                System.out.print(" * ");
                else
                System.out.print("   ");

            
            }
            System.out.println();


           

        }
    }
    
}
