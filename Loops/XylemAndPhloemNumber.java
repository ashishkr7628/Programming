public class XylemAndPhloemNumber {

    public static void main(String[] args) {
        
        int num=434251;

        int ext_sum= num%10;
        int sum=0;
        int count=0;
        int sum_ext=num%10;

        while (num!=0) {

            int rem=num%10;
            sum+=rem;
            count++;

            if(num>0 && num<=9)
            ext_sum+=num;


            num/=10;
            
        }



        




       

        System.out.println((sum-ext_sum==ext_sum)?"Xylem":"Phloem");

    }
    
}
