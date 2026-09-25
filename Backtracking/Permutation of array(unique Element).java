class Solution {
    static List<List<Integer>>ans = new ArrayList<>();

    public static void solve(List<Integer>newIp , List<Integer>newOp ){
        if(newIp.size() == 0){
            ans.add(new ArrayList(newOp));
            return;
        }

        for(int i = 0; i<newIp.size(); i++){
            int element = newIp.get(i);
             List<Integer>nextIp = new ArrayList<>(newIp);
             nextIp.remove(i);
             List<Integer>nextOp = new ArrayList<>(newOp);
             nextOp.add(element);

            solve(nextIp, nextOp);

        }
    }
    public List<List<Integer>> permute(int[] nums) {
          
          ans.clear();
        List<Integer>ip = new ArrayList<>();
        List<Integer>op = new ArrayList<>();

        for(int x:nums){
            ip.add(x);

        }

        solve(ip,op);
        return ans;
        
    }
}



// Choice Tree Diagram //
                             [1,   2,     3]
                            /    |         \
                          /      |           \
                     [2, 3]   [1, 3]           [1, 2]
                      /  \      /  \           /      \
                  [3]    [2]   [2]  [3]        [3]    [2]
                   |      |      |    |          |      |
                     [1, 3, 2]     [2, 3, 1]        [3, 2, 1]
                   |             |               |
                [1, 2, 3]  [2, 1, 3] [2, 3, 1] [3, 1, 2]
