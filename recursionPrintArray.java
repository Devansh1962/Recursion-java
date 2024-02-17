public class recursionPrintArray {
    // PRINT ARRAY 
static void printArray(int[] arr , int indx){
    // base case
    if(indx == arr.length) return;
    
    // self work 
    System.out.println(arr[indx]);

    // recursion work 
    printArray(arr, indx + 1);


}

// FIND MAX VALUE IN ARRAY 
static int PrintMaxValue(int[] arr , int indx){
    // base case 
    if(indx == arr.length-1) return arr[indx];

    // recursion work 
    int smallprob = PrintMaxValue(arr, indx + 1);
    

    // self work 
     return Math.max(arr[indx], smallprob);
}
public static void main(String[] args) {
    int[] arr = {2,3,6,8,1,4};
    printArray(arr, 0);
    System.out.println("Max value in array " + PrintMaxValue(arr, 0));
}
    
}
