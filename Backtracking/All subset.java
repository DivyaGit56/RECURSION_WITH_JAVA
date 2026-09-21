class Solution {
    
      public static ArrayList<ArrayList<Integer>>ans;
    public static void solve(int [] arr,int i, ArrayList<Integer>curr){
       
        
        if(i == arr.length){
            ans.add(new ArrayList<>(curr));
            return ;
        }
        solve(arr,i+1,curr);
        
        curr.add(arr[i]);
        solve(arr,i+1,curr);
        
        curr.remove(curr.size() - 1);
        
        
    }
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        // code here
        ans = new ArrayList<>();
       ArrayList<Integer> curr = new ArrayList<>();

        solve(arr,0,curr);
        
        return ans;
        
    }
}
