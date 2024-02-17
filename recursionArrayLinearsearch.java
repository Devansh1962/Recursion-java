public class recursionArrayLinearsearch {

    static boolean FindTarget(int[] arr, int target ,int indx){
        // base case 
        if(indx >= arr.length) return false;

        // self work
        if(arr[indx] == target) return true;

        // recursion work
       return FindTarget(arr, target, indx+1);
    }

    // find 1st index of trgets 
    static int FindIndex(int[] arr, int target ,int indx){
        // base case 
        if(indx >= arr.length) return -1;

        // self work
        if(arr[indx] == target) return indx;

        // recursion work
        return FindIndex(arr, target, indx+1);
    }
    // Find all index of targets 
    static void FindallIndex(int[] arr , int target , int indx){
        // base case 
        if(indx >= arr.length){
            return;
        }
        // self worl
        if(arr[indx] == target){
            System.out.println(indx);
        }
        // recursion work 
        FindallIndex(arr, target, indx+1);
    }
    

    public static void main(String[] args) {
        int[] arr = {1,2,7,4,2,6,2};
        int target = 2;
    //     if(FindTarget(arr, target, 0)){
    //         System.out.println("Target match ");;
    //     }
    //     else{
    //         System.out.println("Target not match ");
    //     }

     System.out.println(FindIndex(arr, target, 0));
    // FindallIndex(arr, target, 0);


     }
    
}
