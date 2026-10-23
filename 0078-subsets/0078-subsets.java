class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(0, new ArrayList<>(), result, nums);
        return result;
    }

    private void backtrack(int idx, List<Integer>current, List<List<Integer>> result, int[]nums){
        
        result.add(new ArrayList<>(current));

        for(int i =idx;i<nums.length;i++){
            current.add(nums[i]);
            backtrack(i+1, current, result, nums);
            current.remove(current.size()-1);
        }
        
    }
}