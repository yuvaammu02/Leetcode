// Last updated: 12/08/2026, 12:01:56
class Solution {
    private String[] board;
    private int xMoves = 0, oMoves = 0;
    public boolean validTicTacToe(String[] board) {
        this.board = board;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                char ch = board[i].charAt(j);
                if (ch == 'X')
                    ++xMoves; 
                else if (ch == 'O')
                    ++oMoves;
            }
        return boardValidation();
    }
    private boolean boardValidation() {
        if (oMoves > xMoves)
            return false;
        if (xMoves > oMoves + 1)
            return false;
        boolean xWin = winner('X');
        boolean oWin = winner('O');
        if (xWin && oWin)
            return false;
        if (xWin && xMoves == oMoves) 
            return false;
        if (oWin && xMoves > oMoves) 
            return false;
        return true;
    }
    private boolean winner(char player) {
        if (board[0].charAt(0) == player && board[1].charAt(1) == player && board[2].charAt(2) == player)
            return true;
        if (board[0].charAt(2) == player && board[1].charAt(1) == player && board[2].charAt(0) == player)
            return true;
        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(0) == player && board[i].charAt(1) == player && board[i].charAt(2) == player)
                return true;
            if (board[0].charAt(i) == player && board[1].charAt(i) == player && board[2].charAt(i) == player)
                return true;
        }
        return false;
    }
}