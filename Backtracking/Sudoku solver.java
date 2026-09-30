class Solution {

    public static boolean isValid(int r, int c, int[][] mat, int d) {

        // Row + Column
        for (int i = 0; i < 9; i++) {
            if (mat[i][c] == d)
                return false;

            if (mat[r][i] == d)
                return false;
        }

        // 3 x 3 box
        int startRow = (r / 3) * 3;
        int startCol = (c / 3) * 3;

        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {

                if (mat[startRow + k][startCol + l] == d) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean solve(int[][] mat) {

        // Find empty cell
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (mat[i][j] == 0) {

                    // Try 1 to 9
                    for (int d = 1; d <= 9; d++) {

                        if (isValid(i, j, mat, d)) {

                            // Choose
                            mat[i][j] = d;

                            // Explore
                            if (solve(mat)) {
                                return true;
                            }

                            // Undo
                            mat[i][j] = 0;
                        }
                    }

                    // 1-9 tried, nothing worked
                    return false;
                }
            }
        }

        // No empty cell
        return true;
    }

    public void solveSudoku(int[][] mat) {
        solve(mat);
    }
}
