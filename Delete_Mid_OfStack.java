class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        int n = s.size();
        helper(s,0,n);
    }
    
    private static void helper(Stack<Integer> s,int curr,int n){
        if(s.isEmpty()|| curr == n)return;
        
        int top = s.pop();
        if(curr == n/2){
            return;
        }
        helper(s,curr+1,n);
        s.push(top);
    }
}

// but it does not pass all case of test
