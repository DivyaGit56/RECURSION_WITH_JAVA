class Solution {
    
    public static void dfs(int[][] maze, int r, int c,boolean[][]visited, String path,ArrayList<String>ans ){
        int n = maze.length;
        
        if(r == n-1 && c== n-1){
            ans.add(path);
            return;
        }
        
        int[] dr = {1, 0, 0, -1};
        int[] dc = {0, -1, 1, 0};
        char[] dir = {'D', 'L', 'R', 'U'};
        
        for(int i = 0; i<4; i++){
            int nr = r+dr[i];
            int nc = c+dc[i];
            
            if(nr >= 0 && nr < n && nc >= 0 && nc < n && maze[nr][nc] == 1 && !visited[nr][nc]){
              // choose
                visited[nr][nc] = true;

              // explore
              
                dfs(maze, nr, nc, visited,path+dir[i],ans);


              //backtrack
                visited[nr][nc] = false;
            }
        }
        
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
    ArrayList<String>ans = new ArrayList<>();
    int n = maze.length;
    
    if(maze[0][0] == 0 || maze[n-1][n-1] == 0){
        return ans;
    }
    
    boolean[][]visited = new boolean[n][n];
    visited[0][0] = true;
    dfs(maze,0,0,visited,"",ans);
     return ans;
    }
}
