class Solution {
    public List<List<Integer>> generate(int numRows) {

       
        List<List<Integer>>arr= new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer>tempArr=new ArrayList<>();

            // first element
            tempArr.add(1);
            
            // middle element
            for(int j=1;j<i;j++){
                tempArr.add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
            }

            // last element
            if(i>0){
                tempArr.add(1);
            }

            arr.add(tempArr);
        }
        return arr;
        
    }
}