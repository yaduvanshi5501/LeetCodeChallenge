class Solution 
{

    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> board = new ArrayList<>();

        for(int i=0;i<n;i++){
            List<String> row = new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(".");
            }
            board.add(row);
        }
        solve(0, board, n);

        return ans;
    }

    private void solve(int row, List<List<String>>board, int n){

        if(row == n ) {

           List<String> result = new ArrayList<>();

           for(List<String> r: board){
            result.add(String.join("",r));
           }

           ans.add(result);
           return;
        }

        for(int col=0; col<n; col++){
           if(isSafe(row, col, board, n)){

                board.get(row).set(col,"Q");

                solve(row + 1, board, n);

                board.get(row).set(col, ".");
           }
        }
    }

    private boolean isSafe(int row, int col, List<List<String>>board, int n){

        // Vertical check
        for (int i = row-1; i >= 0; i--) {
            if (board.get(i).get(col).equals("Q"))
                return false;
        }

        // Left diagonal
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).get(j).equals("Q"))
                return false;
        }

        // Right diagonal
        for (int i = row-1, j = col+1; i >= 0 && j < n; i--, j++) {
            if (board.get(i).get(j).equals("Q"))
                return false;
        }

        return true;
    }

}
