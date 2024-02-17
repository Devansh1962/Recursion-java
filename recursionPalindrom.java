import java.util.Scanner;

public class recursionPalindrom {
    static boolean FindPalindrom(String s , int l, int r){
        // base case 
        if(l>=r) return true;

        // recursion work 
        return (s.charAt(r) == s.charAt(l) && FindPalindrom(s,l+1 , r-1));
            
    }

   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int n = s.length();
    if(FindPalindrom(s, 0 , n-1)){
        System.out.println("String is a palindrom");
    }
    else{
        System.out.println("String is not palindrom ");
    }
   }
    
}
