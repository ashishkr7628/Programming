public class InvertedTriangle_1 {

    public static void main(String[] args) {
        int  n=5;

        int stars=5;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=stars; j++){

                System.out.print(" * ");
            }

            System.out.println();
            stars--;
        }
    }
    
}
