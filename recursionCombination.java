public class recursionCombination {
    static void FindCombination(String s, String[] kp , String result){
        // base case 
        if(s.length() == 0){
            System.out.print(result + " ");
            return;
        }
        int currNum = s.charAt(0) - '0';
        String CurrChoosi = kp[currNum]; 

        for(int i = 0; i< CurrChoosi.length(); i++){
            // recursion work 
            FindCombination(s.substring(1), kp, result + CurrChoosi.charAt(i));
        }
    }

    public static void main(String[] args) {
        String s = "23";
        String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        FindCombination(s, kp, "");
    }
    
}
