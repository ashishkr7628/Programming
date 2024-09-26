public class Right_Inverted_Triangle1 {

    public static void main(String[] args) {

        int n=5;


        int spaces=0;
        int stars=n;
        

        for(int i=1; i<=n; i++)
        {


            for(int j=1 ;j<=spaces; j++){

                System.out.print("   ");
            }

            for(int k=1; k<=stars; k++){

                System.out.print(" * ");




            }

            System.out.println();

            stars--;
            spaces++;
        }
    }


    
}
