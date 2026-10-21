class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(0 , new ArrayList<>(), candidates, target);
        return ans;
    }
    private void solve(int idx, List<Integer> temp, int[] candidates, int remaining){

        if(remaining == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        if(idx == candidates.length || remaining < 0) return;

        temp.add(candidates[idx]);

        solve(idx, temp, candidates, remaining - candidates[idx]);

        temp.remove(temp.size()-1);

        solve(idx+1, temp, candidates, remaining);

    }
}