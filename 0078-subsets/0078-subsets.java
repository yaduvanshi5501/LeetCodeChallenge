class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(0, new ArrayList<>(), result, nums);
        return result;
    }

    private void backtrack(int idx, List<Integer>current, List<List<Integer>> result, int[]nums){
        
        result.add(new ArrayList<>(current));
        
        for(int j=idx; j<nums.length; j++){
            
            current.add(nums[j]);

            backtrack(j+1, current,result, nums);

            current.remove(current.size()-1);
        }
        
    }
}