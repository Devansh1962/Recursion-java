import java.util.ArrayList;
import java.util.Scanner;

public class recursionFindSubsequnce {
// Find subsequence print in ArrayList 
// time complexity 2^n hogi jo best nahi hai
static ArrayList<String> FindSub(String s){
    // create arraylist 
    ArrayList<String> ans = new ArrayList<>();

    // base case 
    if(s.length() == 0){
        ans.add("");
        return ans;
    }

    // current index value 
    char currentchar = s.charAt(0);
    // recursion work 
    ArrayList<String> smallpro = FindSub(s.substring(1));
    // for each loop 
    for(String i : smallpro){
        ans.add(i);
        // self work
        ans.add(currentchar + i);
    }
    return ans;
    
}

//2ns aproch 
// time complexity n^2 jo use beeter 
static void FindSubsequnce(String s, String currAns){

    // base case
    if(s.length()  == 0){
        System.out.println(currAns);
        return;
    }
        char currChar = s.charAt(0);
        String remString = s.substring(1);
        // self work 
        FindSubsequnce(remString, currAns + currChar);
        // recursion work 
        FindSubsequnce(remString, currAns);
        
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    // ArrayList<String> ans = FindSub(s);
    // // for loop 
    // for(String i : ans){
    //     System.out.println(i);
    // }

    FindSubsequnce(s, " ");

}
    
}
