import java.util.*;
public class factorial {
    //Factorial
    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int fact = 1;
        for(int i = n ; i >= 1 ; i--){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("Factorial of the number "+ n+ " = "+ result);
       

    }
    
}
