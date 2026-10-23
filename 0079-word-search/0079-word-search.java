class Solution {
    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;
        int idx =0;
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(char[][] board, String word, int r, int c, int idx){
        if(idx == word.length()) return true;

        if( r < 0 || r >= board.length ||
            c < 0 || c >= board[0].length ||
            board[r][c] != word.charAt(idx)) return false;

        char ch = board[r][c];
        board[r][c] = '#';

        boolean found = 
            dfs(board, word, r+1, c, idx+1) ||
            dfs(board, word, r-1, c, idx+1) ||
            dfs(board, word, r, c+1, idx+1) ||
            dfs(board, word, r, c-1, idx+1);

        board[r][c] = ch;
        return found;
    }
}