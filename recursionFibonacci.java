import java.util.Scanner;;

public class recursionFibonacci {
    static int findFibonscci(int n){
        // base case 
        if(n == 0 || n == 1){
            return n;
        }
        // recursion work 
        int prev = findFibonscci(n-1);
        int prevs = findFibonscci(n-2);
        // self work 
         return prev + prevs;
        // or
        // return findFibonscci(n-1) + findFibonscci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<=n; i++){
            System.out.println(findFibonscci(i));
        }
    }
    
}
