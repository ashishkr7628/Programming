public class PalindromeNumber {

    public static void main(String[] args) {


        int n=84481;

        int num=n;

        int rev=0;

        while (n!=0) {

            int rem=n%10;

            rev=rev*10+rem;

            n/=10;
            
        }

       System.out.println((num==rev)? "Palindrome": "Not a Palindrome");

    }

}
