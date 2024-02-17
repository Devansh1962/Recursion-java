import java.util.Scanner;

public class recursionSumNatruralnum {
    static int Findsumnatural(int n){
        // base case 
        if(n == 0) return 0;

        // recursion work 
        if(n % 2 == 0){
            // n even num 
            return Findsumnatural(n-1) - n;
        }
        // n odd num 
         return Findsumnatural(n-1) + n;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter digit ");
        int n = sc.nextInt();
        System.out.println(Findsumnatural(n));
    }
    
}
