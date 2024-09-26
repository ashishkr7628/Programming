public class Hollow_Right_Triangle {

    public static void main(String[] args) {
        int n=5;

        int stars=1;
        int spaces=n-1;


        for(int i=1; i<=n; i++)
        {


            for(int j=1; j<=spaces; j++){
                System.out.print("   ");
            }

            for(int j=1; j<=stars; j++){

                if(j==1 || i==n || j==stars)
                System.out.print(" * ");

                else
                System.out.print("   ");
            }

            stars++;
            spaces--;

            System.out.println();
        }
    }
    
}
