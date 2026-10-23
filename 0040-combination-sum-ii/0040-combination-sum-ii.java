class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(0, new ArrayList<>(), candidates, target);
        return ans;
    }

    private void solve(int idx, List<Integer>temp, int[] candidates, int rem){
        if(rem == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = idx;i<candidates.length;i++){
            if(i > idx && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > rem ) break;
            
            temp.add(candidates[i]);
            solve(i+1,temp,candidates, rem-candidates[i]);
            temp.remove(temp.size()-1);
        }
    }
}