// WITH RECURSION
class Solution {
    
    static void sort(int arr[],int n){
        // base case
        if(n<=1)return ;
        // sort first n-1 element
        sort(arr,n-1);
        
        int last = arr[n-1];
        int j = n-2;
        while(j>=0 && arr[j]>last){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
        
    }
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        int n = arr.length;
        sort(arr,n);
    }
}

//  WITH ITERATION 
class Solution {
    public void insertionSort(int arr[]) {
        int n = arr.length;
        
        for(int i = 1; i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] >key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
            }
        }
