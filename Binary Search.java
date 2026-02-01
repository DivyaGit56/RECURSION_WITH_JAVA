class Solution {
    
    // RECURSIVE APPROACH
    
    static int solve(int [] arr,int low, int high, int target){
        int ans = -1;
        // Base case
        
    
        if(low>high){
            return -1;
        }
        
        int mid = low+(high-low)/2;
        if(arr[mid] == target){
        // search left for first occurrence
            int leftAns = solve(arr, low, mid - 1, target);
            return (leftAns != -1) ? leftAns : mid;
        }
        else if(arr[mid]>target){
            return solve(arr,low,mid-1,target);
        }else{
            return solve(arr,mid+1,high, target);
        }
    }
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int n = arr.length;
      return solve(arr,0,n-1,k);
    }
    
    // ITERATIVE APPROACH
    
    static int solve(int[]arr,int target){
        int low = 0; int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(arr[mid] == target){
                ans = mid;        // store answer
            high = mid - 1; 
            }
            
            else if(arr[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
     public int binarysearch(int[] arr, int k) {
         Arrays.sort(arr);
        return solve(arr,k);
    
}
}
