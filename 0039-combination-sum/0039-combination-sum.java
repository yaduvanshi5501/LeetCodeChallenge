class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(0 ,0, new ArrayList<>(), candidates, target);
        return ans;
    }
    private void solve(int idx, int sum, List<Integer> temp, int[] candidates, int target){

        // if(idx == candidates.length){
            if(sum == target){
                ans.add(new ArrayList<>(temp));
                return;
            }
        // }
        if(sum > target || idx == candidates.length) return;

        sum += candidates[idx];
        temp.add(candidates[idx]);

        solve(idx, sum, temp, candidates, target);

        sum -= candidates[idx];
        temp.remove(temp.size()-1);

        solve(idx+1, sum, temp, candidates, target);

    }
}