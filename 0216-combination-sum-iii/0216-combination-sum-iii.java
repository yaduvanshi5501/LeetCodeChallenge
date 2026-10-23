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

        if(temp.size() >= k || rem <= 0) return;

        for(int i=idx;i<10;i++){
         
            temp.add(i);
            solve(i+1, temp, k ,rem - i);

            temp.remove(temp.size()-1);
        }

    }
}