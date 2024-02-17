import java.util.Scanner;

public class recursionSumallSubset {
    // print sum of all subset 
    static void SumSubset(int[] arr , int indx, int currSum){
        // base case 
        if(indx >= arr.length){
            System.out.println(currSum);
            return;
        }

        // self work 
        // include
        SumSubset(arr, indx+1, currSum + arr[indx]);
        // recursion work
        // exclude
        SumSubset(arr, indx+1, currSum);


    }

    public static void main(String[] args){
        int[] arr = {2,3,4};
        SumSubset(arr, 0, 0);

    }
}
    

