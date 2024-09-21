public class ReverseOfDigits {
      

    public static void main(String[] args) {
        
        int n=8456;
        int rev=0;

        while (n!=0) {

            int rem=n%10;
            rev= rev*10+rem;
            n/=10;
            
        }

        System.out.println("Reverse of a number: "+rev);
    }



    
}
