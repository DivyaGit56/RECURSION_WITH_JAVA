class Solution {
    public void sort(int[]arr,int n){
        
        
        if(n == 1)return;
        
        for(int i =0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            
        }
        sort(arr,n-1);
        
    }
    public void bubbleSort(int[] arr) {
        // code here
        int n = arr.length;
        sort(arr,n);
    }
}
