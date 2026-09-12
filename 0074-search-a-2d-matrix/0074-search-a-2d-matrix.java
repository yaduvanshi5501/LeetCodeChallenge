class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int r=matrix.length;
        int c=matrix[0].length;

        int left =0;
        int right = r*c-1;

        System.out.println(left + " " + right);

        while(left<=right){
            int mid = left + (right-left)/2;

            int row = mid / c;
            int col = mid %c;

            System.out.println(row + " " + col);

            if(matrix[row][col]==target) return true;

            if(matrix[row][col] < target) left = mid +1;
            else right = mid-1;
        }
        return false;
    }
}