class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.size()==1)return;
        int temp = st.pop();
        
        reverseStack(st);
        
        insert(st,temp);
        return;
    }
    
    private static void insert(Stack<Integer> st,int temp){
        if(st.isEmpty()){
            st.push(temp);
            return;
        }
        int top = st.pop();
        insert(st,temp);
        st.push(top);
        return;
    }
}
