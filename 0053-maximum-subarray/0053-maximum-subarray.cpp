class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxe=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.size();i++){
            maxe = max(nums[i],maxe+nums[i]);
            ans= max(maxe,ans);
        }
        
        return ans;
    }
};