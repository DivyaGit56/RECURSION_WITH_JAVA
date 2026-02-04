// WITH RECURSION
class Solution {
    static int solve(int []arr, int x,int index){
        // Base Case
        if(index == arr.length)return 0;
        
        if(arr[index] == x ){
            return index;
        }else{
          return solve(arr,x,index+1);
        }
    }
    public int search(int arr[], int x) {
        // code here
        int index = 0;
        return solve(arr,x,index);
    }
}

// WITH ITERATION

class Solution {
     public int search(int arr[], int x) {
        // code here
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x)
            return i;
        }
        return -1;
     }
}
