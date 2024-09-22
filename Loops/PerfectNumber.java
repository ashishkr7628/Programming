public class PerfectNumber {

    public static void main(String[] args) {
        int n =6;
        int n1=n;
        int sum=0;

        for(int i=1; i<6;i++){

            if(n%i==0)
            sum+=i;
        }

        System.out.println((n1==sum)?"Perfect Number":"Not a Perfect Number");
    }
    
}
