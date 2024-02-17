import java.util.Scanner;

public class recurisonFindpower {
    static int Findpower(int p ,int q){
        // Base case 
          if(q == 0) return 1;
            // System.out.println(1);
          
            // return;
          

        //   } return 1;
        // normal meyhod 

        // int ans = 1 ;
        // for(int i = 1; i<=q; i++){
        //     ans *= p;
        //      System.out.println(ans);


        // }
        // return ans;

        // recurison work
        int lestpower = Findpower(p , q-1);
        return lestpower * p;
        
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter digit ");
        int p = sc.nextInt();
        int q = sc.nextInt();
         System.out.println(Findpower(p, q));
        // Findpower(p, q);
    }
    
}
