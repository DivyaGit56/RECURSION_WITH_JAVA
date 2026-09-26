class Solution {
    public static void solve(int[] candidates,int i , int target ,List<Integer>curr, List<List<Integer>>res,HashSet<List<Integer>> st){

        if(target == 0){
            if (!st.contains(curr)) {
                st.add(new ArrayList<>(curr));
            res.add(new ArrayList<>(curr));
            }
            return;

        }
        
        if(i == candidates.length || target < 0){
            return;
        }

       
        // Choice 1: Take candidates[i]
        if (candidates[i] <= target) {
            curr.add(candidates[i]);

            // Same i because we can use the element again
            solve(candidates, i+1, target - candidates[i], curr, res,st);

            // Backtrack
            curr.remove(curr.size() - 1);
        }

        // Choice 2: Skip candidates[i]
        solve(candidates, i + 1, target, curr, res,st);
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>>res = new ArrayList<>();
        List<Integer>curr = new ArrayList<>();

        HashSet<List<Integer>> st = new HashSet<>();

        Arrays.sort(candidates);
        solve(candidates,0,target,curr,res,st);
        return res;
        
    }
}
