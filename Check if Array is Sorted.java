// WITH RECURSION
class Solution {
   
    public boolean solve(int[]arr,int index){
        int n = arr.length;
        // Base Case
        if(index == n-1)return true;
        
        return arr[index]<arr[index+1]&&solve(arr,index+1);
    }
    public boolean isSorted(int[] arr) {
        // code here
        int index = 0;
        return solve(arr,index);
    }
}

// WITH ITERATION
class Solution {
    public boolean isSorted(int[] arr) {
        
        int n = arr.length;
        for(int i =0; i<n-1; i++){
            if(arr[i]>arr[i+1])
            return false;
        }
        return true;
    }
}
