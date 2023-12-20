import java.util.Scanner;

public class Recusion {
    //Recursion examples
    public static void main(String agrs[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();
        countdown(n);
        
    }

    public static void countdown(int n){
        if(n == 0){
            return; //Exitting a method
        }
        System.out.println(n);
        countdown(n - 1);
        System.out.println("After countdown " + n);
    }
}
