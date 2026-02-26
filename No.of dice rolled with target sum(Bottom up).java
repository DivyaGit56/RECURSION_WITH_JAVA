class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        
        int MOD = 1000000007;
        int[][] dp = new int[n + 1][target + 1];
        
        // Base case
        dp[0][0] = 1;
        
        for(int dice = 1; dice <= n; dice++) {
            for(int t = 1; t <= target; t++) {
                
                int ways = 0;
                
                for(int face = 1; face <= k; face++) {
                    if(t - face >= 0) {
                        ways = (ways + dp[dice - 1][t - face]) % MOD;
                    }
                }
                
                dp[dice][t] = ways;
            }
        }
        
        return dp[n][target];
    }
}
