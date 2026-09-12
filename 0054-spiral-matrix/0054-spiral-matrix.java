class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // int r=matrix.length;
        // int c=matrix[0].length;

        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;

        ArrayList<Integer> arr= new ArrayList<>();

        while(top<= bottom && left<=right){
            // left->right
            for(int c=left;c<=right;c++){
                arr.add(matrix[top][c]);
            }
            top++;

            // top->bottom
             for(int r=top;r<=bottom;r++){
                arr.add(matrix[r][right]);
            }
            right--;
            
            // left-->right
            if(top<=bottom){
                for(int c=right;c>=left;c--){
                    arr.add(matrix[bottom][c]);
                }
            }
            bottom--;
            
            // bottom --> top
            if(left<=right){
                for(int r=bottom;r>=top;r--){
                    arr.add(matrix[r][left]);
                }
            }
            left++;
            
        }
        return arr;
    }
}