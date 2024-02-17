import java.util.Scanner;

public class recursionDigitsum {
    static int Finddigitsum(int n){
        // Base case 
        if(n >= 0 && n <= 9){
            return 1;
        }
        //  int b = n%10;
        // recurison work 
        int a = Finddigitsum(n/10);
        // sum of digits code 
        // self work
        int b = n % 10;
         return a+b;
        //  count digit code 
         return a+1;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter digit ");
        int n = sc.nextInt();
        System.out.println(Finddigitsum(n));
    }
    
}
