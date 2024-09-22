public class Decimal_Binary {

    public static void main(String[] args) {
        int dec=5;
        int bin=0;
        int prod=10;

        while (dec!=0) {
            bin= bin*prod+dec%2;
           
            dec/=2;


            
        }
        System.out.println(bin);
        

    }
    
}
