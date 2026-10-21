class Solution {
    List<List<Integer>>ans = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        solve(1, new ArrayList<>(), k, n);
        return ans;
    }

    private void solve(int idx, List<Integer> temp ,int k, int rem){
        if(temp.size() == k && rem == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(idx > 9 || rem < 0) return;

        temp.add(idx);
        solve(idx+1, temp, k ,rem - idx);

        temp.remove(temp.size()-1);
        solve(idx+1, temp, k ,rem);

    }
}