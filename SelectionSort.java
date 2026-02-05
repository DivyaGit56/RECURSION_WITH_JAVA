// WITH RECURSION
class Solution {
    void sort(int []arr,int n, int i){
        // Base Case
        if(i == n-1)return;
        
        int minIndex = i;
        for(int j=i+1; j<n;j++){
            if(arr[j]<arr[minIndex]){
                minIndex = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
        
        sort(arr,n,i+1);
    }
    void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        sort(arr,n,0);
    }
}

// WITH ITERATION 
class Solution {
    void selectionSort(int[] arr) {
        
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            
            
        
                    
                }
            }
        }
