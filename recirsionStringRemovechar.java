import java.util.Scanner;

public class recirsionStringRemovechar {
    // REMOVE ALL OCCURRENCE "A" 
    static String removeA(String s, int indx){
        // base case
        if(indx >= s.length()) return " ";

        // recursion work 
       String smallpro = removeA(s, indx+1);

        // initilize current index 
        char currentChar = s.charAt(indx);

        // self worl 
        if(currentChar != 'a'){
            return currentChar + smallpro;
        }
        else{
            return smallpro;
        }
    }

    // 2nd approch without using index
    static String removeA2(String s){
        // base case 
        if(s.length() == 0) return "";

        String smallpro = removeA2(s.substring(1));

        char currentChar = s.charAt(0);

        // self worl 
        if(currentChar != 'a'){
            return currentChar + smallpro;
        }
        else{
            return smallpro;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        String s = sc.nextLine();
        System.out.println(removeA(s, 0));
        System.out.println(removeA2(s));
    }
    
}
