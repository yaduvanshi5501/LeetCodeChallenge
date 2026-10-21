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

        if(idx == candidates.length || rem < 0 ) return;

        temp.add(candidates[idx]);
        solve(idx+1, temp, candidates, rem - candidates[idx]);

        temp.remove(temp.size() - 1);

        int next = idx + 1;
        while (next < candidates.length &&
               candidates[next] == candidates[idx]) {
            next++;
        }

        solve(next, temp, candidates, rem);
    }
}