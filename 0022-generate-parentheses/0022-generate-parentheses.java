class Solution {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        
        backtrack("",0,0,n); 
        return result;
    }

    private void backtrack(String s,int open,int close,int n){
        if(open == n && close == n){
            result.add(s);
            return;
        }

        if(open < n){
            backtrack(s+"(", open+1, close,n);
        }

        if(close < open){
            backtrack(s+")", open, close+1,n);
        }
    }
}