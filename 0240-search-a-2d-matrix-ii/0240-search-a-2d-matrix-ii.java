class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        
        int row =0;
        int col = c-1;
        while(row>=0 && row<r && col>=0 && col<c){
            
            System.out.println(row + " " + col);
            if(matrix[row][col]==target) return true;

            if(matrix[row][col] < target)  row++;
            else col--;
        }
        return false;
    }
}