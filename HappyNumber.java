public class HappyNumber {
public static void main(String[] args) {
    int n=7;
    
    int sqr=n*n;

    

  
    while (sqr>=10) {
      
    
      int sum=0;

    while (sqr!=0) {
      

        sum+=Math.pow(sqr%10,2);

        sqr/=10;




        
    }

    
    sqr=sum;

  }


System.out.println((sqr==1)?true:false);
}
}    

