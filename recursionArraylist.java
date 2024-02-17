import java.util.ArrayList;

public class recursionArraylist {
    // find all index of targets in ArrrayList
    static ArrayList<Integer> AllIndex(int[] arr , int target , int indx){
        // create empyt Arraylist
        ArrayList<Integer> ans = new ArrayList<>();
        // base case 
        if(indx >= arr.length){
            return ans;
        }
        // self work
        if(arr[indx] == target){
            ans.add(indx);
        }
        // recursion work
        ArrayList<Integer> smallpro = AllIndex(arr, target, indx+1);
        ans.addAll(smallpro);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,2};
        int target = 2;
        ArrayList<Integer> ans = AllIndex(arr , target , 0);
        // foe each loop
        for(Integer i : ans){
            System.out.println(i);
        }
        
        
        
    
    }
    
    
}
