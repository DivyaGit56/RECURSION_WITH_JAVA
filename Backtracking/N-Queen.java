class Solution {
    public static void solve(int row, char[][]boards,int n,List<List<String>>ans){
        // base
        if(row == n){
            List<String>curr = new ArrayList<>();

            for(int i = 0; i<row; i++){
                curr.add(new String(boards[i]));
            }
            ans.add(curr);
            return;
        }

        // ab is row ke har ek column me ja kr check krna h place kr sakte h ki nhi

        for(int col = 0; col<n; col++){
            if(isSafe(row,col,boards,n)){

                // choose
                boards[row][col] ='Q';

                // explore
                solve(row+1,boards,n,ans);

                // backtrack
                boards[row][col] = '.';


            }
        }
    }

    public static boolean isSafe(int row, int col, char[][]boards,int n){

        // check same colomn
        for(int i = 0; i<row; i++){
            if(boards[i][col] == 'Q'){
                return false;
            }
        }

        // check for upper left diagonal

        int i = row-1;
        int j = col-1;

        while(i>= 0 && j>= 0){
            if(boards[i][j] == 'Q'){
                return false;
            }
            i--;
            j--;
        }

    //   check for upper right diagonal
     i = row-1;
     j = col+1;

        while(i>= 0 && j< n){
            if(boards[i][j] == 'Q'){
                return false;
            }
            i--;
            j++;
        }



  return true;

    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans = new ArrayList<>();

        char[][]boards = new char[n][n];

        for(int i = 0; i<n; i++){
            Arrays.fill(boards[i],'.');
        }

        // explore each row to find correct position to place queen in correct colomn of that row
        solve(0,boards,n,ans);
        return ans;
        
    }
}
