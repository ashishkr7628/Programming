public class NeonNumber {


    public static void main(String[] args) {
        
        int n=9;
        int sqr=n*n;
        int sum=0;
        while (sqr!=0) {
            int rem= sqr%10;
            sum+=rem;
            sqr/=10;

            
        }

        System.out.println((n==sum)?true:false);




    }
    
}
