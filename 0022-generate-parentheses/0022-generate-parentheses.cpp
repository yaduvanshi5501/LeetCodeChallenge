class Solution {
public:
    void solve(int n, vector<string>&ans,int cnt,string res){
        if(cnt<0 || cnt>n || size(res)>2*n){
            return;
        }
        if(size(res)==2*n && cnt==0){
            ans.push_back(res);
        }
        solve(n,ans,cnt+1,res+'(');
        solve(n,ans,cnt-1,res+')');

    }
    vector<string> generateParenthesis(int n) {
        vector<string> ans;
        solve(n,ans,1,"(");
        return ans;
    }
};