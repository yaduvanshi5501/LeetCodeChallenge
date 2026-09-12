class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        
        auto k = lower_bound(nums.begin(),nums.end(),target)-nums.begin();
        if(k<nums.size() && nums[k]==target) return k;
        return k;
    }
};