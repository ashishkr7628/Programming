public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 1234;

        int prod=1;

        while (n!=0) {
            int rem=n%10;
            prod*=rem;
            n/=10;
            
        }

        System.out.println("Product of Digits: "+prod);

    }
}
