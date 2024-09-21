public class CountNumber {

    public static void main(String[] args) {

        int n = 123456;
        int num = n;
        ;
        int count = 0;

        while (n != 0) {

            count++;
            n /= 10;
        }

        System.out.println("No. of digits in " + num + ": " + count);

    }

}
