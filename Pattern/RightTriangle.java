public class RightTriangle{

public static void main(String[] args) {
    int  n=5;

    int stars=1;

    int spaces=n-1;

    for(int i=1; i<=n; i++){
        for(int j=1; j<=spaces; j++)
        System.out.print("   ");

        for(int j=1;j<=stars; j++)
        System.out.print(" * ");

        stars++;
        spaces--;

        System.out.println();

    }
}


}