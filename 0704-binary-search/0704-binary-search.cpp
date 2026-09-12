class Solution {
public:
    int search(vector<int>& nums, int target) {
        int n=nums.size();
        auto k=lower_bound(nums.begin(),nums.end(),target)-nums.begin();
        if(k<n &&  nums[k]==target) return k;
        return -1;
    }
};