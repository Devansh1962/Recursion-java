import java.util.Scanner;
public class recursionFactorial {
    static int factorialnum(int n){
        // base caSE
        if(n == 0){
        //   System.out.println(1);
            return 1;
        }
        //  n-1 recursion work
        
        // int smallans = factorialnum(n-1);
        // self work
        // int ans = n*smallans;
        // return ans;
        return n*factorialnum(n-1);
        //  factorialnum(n)=n*factorialnum(n-1);
        //  return ;
        //  System.out.println(n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num ");
        int n = sc.nextInt();
        System.out.println(factorialnum(n));
        // factorialnum(n);
    }
    
}
