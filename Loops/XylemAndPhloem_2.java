public class XylemAndPhloem_2 {

    public static void main(String[] args) {
        
        int n=73242;
        int n1=n;
        int ext_sum=n%10;
   
        int count=0;
        int total_sum=0;

        while (n!=0) {


            int rem= n%10;

            total_sum+=rem;

            count++;
            n/=10;


            
        }

        int last_num=n1/(int)(Math.pow(10, count-1));

        ext_sum+=last_num;

        System.out.println((total_sum-ext_sum==ext_sum)?"Xylem":"Phloem");
       
       

    }
    
}
