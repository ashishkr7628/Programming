public class PrimePalindrome {

    public static void main(String[] args) {
        
        int n=7;

        int temp=n;

        int rev=0;

        while (n!=0) {

            rev+=n%10;
            n/=10;
            
        }

        boolean bool=true;

        for(int i=2;i<=temp/2;i++){
            if(temp%i==0)
            bool=false;
            break;
        }

       System.out.println ((rev==temp && bool)?true:false);




         


        

    }
    
}
