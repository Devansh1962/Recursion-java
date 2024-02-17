import java.util.Scanner;

public class recursionStringReverse {

    static String reverseString(String s ,int indx){

        // base case
         if(indx >= s.length()) return "";

        //  recursion work
        String smallpro = reverseString(s, indx+1);

        // self woirk
         return smallpro + s.charAt(indx);
    }
    // 2nd APProch without index 
    static String revereseString2(String s){
        // base case 
        if(s.length() == 0) return "";
        // recursion work
        String smallpro = revereseString2(s.substring(1));
        // self work 
        return smallpro + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // System.out.println(reverseString(s, 0));
        //check  palindrome string 
        String rev = reverseString(s, 0);
        if(rev.equals(s)){
            System.out.printf("%s is a palindrom", s);

        }
        else{
            System.out.printf("%s is not palindrom", s);
        }
    }
    
}
