class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }


// WHEN PIVOT IS CHOSEN AS LAST ELEMENT

    private int partition(int[] arr, int low, int high) {
        
        // code here
        
        int pivot = arr[high];
        int i = low-1;
        
        for(int j = low; j<high; j++){
            if(arr[j]<=pivot){
                i++;
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // place pivot at correct position
        
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}
// WHEN PIVOT IS CHOSEN AS FIRST ELEMENT
private int partition(int[] arr, int low, int high) {
    int pivot = arr[low];
    int i = low +1;
    int j = high;
    
    while(i<=j){
        while(i<=high && arr[i]<= pivot)i++;
        while(arr[j]>pivot)j--;
        
        if(i<j){
            int temp = arr[ i];
            arr[i] = arr[j];
            arr[j] = temp;
            
        }
    }

   int temp = arr[low];
   arr[low] = arr[j];
   arr[j] = temp;
   return j;
   
}
    
}




