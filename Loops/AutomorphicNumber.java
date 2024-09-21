public class AutomorphicNumber {

    public static void main(String[] args) {

        int n = 7;

        int sqr = n * n;

        boolean auto = true;

        while (n != 0) {

            if (n % 10 != sqr % 10 && n > 0)
                auto = false;

            n /= 10;

        }

        System.out.println(auto);

    }

}
