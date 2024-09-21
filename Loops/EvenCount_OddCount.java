public class EvenCount_OddCount {


    public static void main(String[] args) {
        

        int n=7531;
        int evenCount=0;
        int oddCount=0;

        while (n!=0) {

            int rem=n%10;

            if(rem%2==0)
            evenCount++;
            else
            oddCount++;

            n/=10;
            
        }

        System.out.println("No. of Even digits: "+evenCount);
        System.out.println("No. of Odd digits: "+oddCount);
        System.out.println("No. of Odd and Even digits: "+oddCount+evenCount);


    }
    
}
