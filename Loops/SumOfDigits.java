public class SumOfDigits {

    public static void main(String[] args) {

        int n = 7652;

        int num = n;

        int sum = 0;

        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;

        }

        System.out.println("Sum of Digits of " + num + ": " + sum);

    }

}
