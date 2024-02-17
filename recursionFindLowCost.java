public class recursionFindLowCost {
    // condition ith jump i+1 and i+2 tak ith valu diffrence |i+1term - i+2|
    static int FindminCost(int[] ar, int indx , int n ){
        // base case 
        if(indx == n-1) return 0;
            // System.out.println(CurrSum);
        int op1 = FindminCost(ar , indx + 1 , n) + Math.abs(ar[indx] - ar[indx+1]);
        if(indx == n-2) return op1;
        // case twq i+2
        int op2 = FindminCost(ar, indx+2, n) + Math.abs(ar[indx] - ar[indx+2]);
        return Math.min(op1, op2);
    }

    public static void main(String[] args) {
        int[] ar = {10,30,40,50,20};
        // int n = ar.length;
        System.out.println("Low cost trvel reach point " + FindminCost(ar, 0, ar.length));
    }
    
}
