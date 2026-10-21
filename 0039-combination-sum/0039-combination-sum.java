class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(0 , new ArrayList<>(), candidates, target);
        return ans;
    }
   private void solve(int start, List<Integer> temp,
                       int[] candidates, int remaining) {

        if (remaining == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > remaining) continue;

            temp.add(candidates[i]);

            // i, not i + 1, because reuse is allowed
            solve(i, temp, candidates, remaining - candidates[i]);

            temp.remove(temp.size() - 1);
        }
    }
}