class Solution {
    int [][] t = new int [31][1001];
    int MOD = (int)1e9+7;

    public int solve(int n , int k, int target){
        // Base Case
        if(n == 0 && target == 0) return 1;
        if(n == 0 || target < 0) return 0;


        if(t[n][target] != -1)return t[n][target];
        int ways = 0;

        for(int face = 1; face<= k; face++){
            ways = (ways+solve(n-1,k,target-face))%MOD;
        }
        t[n][target] = ways;
        return ways;
    }
    public int numRollsToTarget(int n, int k, int target) {
      
         // Initialize DP with -1
        for(int[] row : t) {
            Arrays.fill(row, -1);
        }
        return solve(n, k,target);
        
    }
}
