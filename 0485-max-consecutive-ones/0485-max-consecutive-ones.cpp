class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int cnt=0;
        int ans=0;
        for(int a:nums){
            if(a==1) cnt++;
            else{
                cnt=0;
            }
            ans=max(cnt,ans);
        }
        return ans;
    }
};