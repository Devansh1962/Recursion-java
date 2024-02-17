import java.util.Scanner;

public class recursionproblem {
    // wap print all natural num by using recursion method
    // create method
    static void printnaturalnum(int n){
        // base case
        if(n == 1){
            System.out.println(1);
            return;
        }
        // recursion working 
        printnaturalnum(n-1);
        // self work 
        System.out.println(n);
    }
    // wap print all natural no n to 1 (reverse )
    static void reversenatural(int n){
        // base case
        if(n == 1){
            System.out.println(1);
            return;
        }
        if(n<1){
            System.out.println("not natural num " + n);
            return;
        }
            
        // }
        // self work 
        System.out.println(n);
        // recursion work
        reversenatural(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num ");
        int n = sc.nextInt();
         printnaturalnum(n);
        // reversenatural(n);
    } 
    
}
