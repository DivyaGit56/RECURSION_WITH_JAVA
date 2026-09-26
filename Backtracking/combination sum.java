class Solution {
    public static void solve(int[] candidates,int i , int target ,List<Integer>curr, List<List<Integer>>res){

        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;

        }
        
        if(i == candidates.length || target < 0){
            return;
        }
        // Choice 1: Take candidates[i]
        if (candidates[i] <= target) {
            curr.add(candidates[i]);

            // Same i because we can use the element again
            solve(candidates, i, target - candidates[i], curr, res);

            // Backtrack
            curr.remove(curr.size() - 1);
        }

        // Choice 2: Skip candidates[i]
        solve(candidates, i + 1, target, curr, res);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>>res = new ArrayList<>();
        List<Integer>curr = new ArrayList<>();
        solve(candidates,0,target,curr,res);
        return res;
        
    }
}

                          // EXAMPLE //

          candidates = [2, 3, 6, 7]
          target = 7

                                        []
                                  target = 7
                                  /         \
                              TAKE 2       SKIP 2
                                |             |
                               [2]            []
                              t=5            t=7
                             /   \           /   \
                         TAKE 2  SKIP 2   TAKE 3  SKIP 3
                           |        |        |        |
                        [2,2]      [2]      [3]      []
                         t=3       t=5       t=4      t=7
                        /   \      /  \      /  \       |
                    TAKE2 SKIP2 TAKE3 SKIP3 TAKE3 ...  ...
                       |      |      |      |
                    [2,2,2] [2,2]  [2,3]  [2]
                      t=1     t=3    t=2    t=5
                       |       |      |
                     ...    TAKE3  TAKE3
                                |      |
                            [2,2,3]  [2,3,3]
                               t=0      t=-1
                                ✓
