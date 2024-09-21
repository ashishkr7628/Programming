public class SumOfEvenAndOddDigits {


    public static void main(String[] args) {
        int n=5761;

        int sumEven =0;
        int sumOdd= 0;

        while(n!=0){

            int rem=n%10;
            if(rem%2==0)
            sumEven+=rem;

            else
            sumOdd+=rem;

            n/=10;
        }

        System.out.println("Sum of even number: "+sumEven);
        System.out.println("Sum of odd number: "+sumOdd);


    }
    
}
