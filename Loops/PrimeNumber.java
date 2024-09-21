public class PrimeNumber {


    public static void main(String[] args) {
        int n=70;

        int mark=0;

        for(int i=2; i<=n/2; i++){

            if(n%i==0)
            mark++;
        }

        System.out.println(mark==0?(n+" is a Prime Number"):(n+" is not a Prime Number"));
    }
    
}
