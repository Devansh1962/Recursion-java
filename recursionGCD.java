import java.util.Scanner;

public class recursionGCD {
    // long divisor method
    static int FindGcd(int x, int y){
        while (x % y != 0) {
             int rem = x % y;
             x = y;
             y = rem;
            
        }
        return y;
    }
    // Euclids algo 
    static int FindGCD(int x ,int y){
        // base case 
        if(y == 0) return x;

        // recursion work 

        return FindGCD(y , x % y);

    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter digit ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("By long divisor method GCD value " + FindGcd(x, y));
        System.out.println("By RECURSION METHOD GCD value " + FindGCD(x, y));
    }
    
}
