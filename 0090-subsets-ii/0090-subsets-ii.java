class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        solve(0, new ArrayList<>(), nums);
        return ans;
    }
    private void solve(int idx,List<Integer> temp, int[] nums){
        ans.add(new ArrayList<>(temp));

        for(int i = idx; i<nums.length; i++){
            if(i>idx && nums[i] == nums[i-1]) continue;

            temp.add(nums[i]);
            solve(i+1, temp, nums);
            temp.remove(temp.size()-1);
        }
    }
}