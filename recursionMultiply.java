import java.util.Scanner;

public class recursionMultiply {
    static void FindMultiply(int n , int k){
        // Base case 
        if(k == 1){
            System.out.println(n);
           return;
        }

        // recursion work 
        FindMultiply(n, k-1);
        // self work n*k
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter digit ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        FindMultiply(n, k); 
    }
    
}
