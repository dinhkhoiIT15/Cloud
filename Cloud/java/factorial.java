import java.util.Scanner;

public class factorial {
    public static void main(String agrs[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = scn.nextInt();
        long fac = fac(n);
        System.out.println("Factorial of "+ n +" is " + fac);
    }
    
    public static long fac(int n){
        if(n == 0){
            return 1;
        }

        return n * fac(n -1);
    }
}
