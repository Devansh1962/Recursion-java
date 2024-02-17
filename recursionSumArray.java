public class recursionSumArray {
// SUM IN ARRAY ELMENTS
static int SumArray(int[] arr , int indx){
    // base case 
    if(indx == arr.length) return 0;

    // recursion woerk
    int smallprob = SumArray(arr, indx + 1);

    // self work 

    return arr[indx] + smallprob;
}

public static void main(String[] args) {
    int[] arr = {1,2,4,5};
    System.out.println("sum in array elments " + SumArray(arr, 0));
}
    
}
