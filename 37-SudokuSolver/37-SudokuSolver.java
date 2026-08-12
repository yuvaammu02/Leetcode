// Last updated: 12/08/2026, 12:24:43
class Solution {
    public void solveSudoku(char[][] board) {
          solve(board);

    }
    private boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        boolean valid = true;
                        for (int i = 0; i < 9; i++) {
                                   if (board[row][i] == num) {
                                valid = false;
                                break;
                                   }
                                if (board[i][col] == num) {
                                valid = false;
                                break;
                            }
                            int r = 3 * (row / 3) + i / 3;
                            int c = 3 * (col / 3) + i % 3;
                             if (board[r][c] == num) {
                                    valid = false;
                                    break;

                            }

                        }
                        if (valid) {
                               board[row][col] = num;
                            if (solve(board)) {
                                return true;
                            }
                            board[row][col] = '.';
                        }
                    }

                    return false;

                }

            }

        }



        return true;

    }

}