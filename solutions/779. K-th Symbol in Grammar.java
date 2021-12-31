class Solution {
    public int kthGrammar(int n, int k) {
        
        //Determine the position of k with respect to n, If it is to the left side of mid then result will be same as n-1 otherwise result will be the complement of n-1
        
        if(n == 1 && k == 1){
            return 0;
        }
        
        //Determining the location of k with respect to the mid point
        int mid = (int)(Math.pow(2,n-1))/2;
        
        if(k <= mid){
            return kthGrammar(n-1,k);
        }
        else{
            return kthGrammar(n-1, k-mid) ^ 1;
        }
        
        
    }
}
​
​
