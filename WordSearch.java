class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] vist = new boolean[m][n];
        boolean result = false;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == word.charAt(0)) {
                    result = hel(board, word, vist, i, j, 0);
                    if (result) return true;
                }
            }
        }
        return false;
    }
    
    private boolean hel(char[][] board, String word, boolean[][] vist, int i, int j, int index) {
        if(index == word.length()) {
            return true;
        }
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || vist[i][j] ||
         board[i][j] != word.charAt(index)) {
            return false;
        }
        vist[i][j] = true;
        if(hel(board, word, vist, i + 1, j, index + 1) || hel(board, word, vist, i - 1, j, index + 1) || hel(board, word, vist, i, j + 1, index + 1) || hel(board, word, vist, i, j - 1, index + 1)) {
            return true;
        }
        vist[i][j] = false;
        return false;
    }
}
