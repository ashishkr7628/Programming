public class AutomorphicNumber_2 {
public static void main(String[] args) {
    int n = 5;
    int n1=n;

    int sqr = n * n;
    

     int count1=0;
     

     while (n!=0) {

        count1++;
        n/=10;
        
     }

    

     int auto= sqr% (int)(Math.pow(10, count1));

    System.out.println((n1==auto)?true:false);

}    
}
