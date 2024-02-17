public class recirsionArraySort {
    // SORT ARRAY 
    static boolean sortArray(int[] arr, int indx){
        // base case 
        if(indx >= arr.length){
            // System.out.println(0);
            return false;
        }
         if(arr[indx] < sortArray(arr, indx+1)){
            return true;
        //     System.out.println(arr[indx]);
         }
        
        // recursion work 
        return sortArray(arr, indx+1);
        // self work
        // if(arr[indx] < sortArray(arr, indx+1)){
        //     return true;
        //   System.out.println(arr[indx]);

        // }
    }
    
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};
        if(sortArray(arr, 0)){
            System.out.println("array sorted");
        }
        else{
            System.out.println("array not sorted ");
        }
    }
    
}
