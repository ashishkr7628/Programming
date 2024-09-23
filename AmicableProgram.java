public class AmicableProgram {

    public static void main(String[] args) {

        int n1 = 220;

        int n2 = 284;

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0)
                sum1 += i;
        }

        for (int j = 1; j < n2; j++) {
            if (n2 % j == 0)
                sum2 += j;
        }

        System.out.println((sum1 == n2 && sum2 == n1) ? true : false);
    }

}