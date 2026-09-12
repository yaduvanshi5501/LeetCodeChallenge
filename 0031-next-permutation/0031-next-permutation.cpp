class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int n= nums.size();

        int p=n-2;
        while(p>=0 && nums[p]>=nums[p+1]) p--;

        if(p>=0){
        int i=n-1;
            while(i>=0 && nums[i]<=nums[p]) i--;
            swap(nums[i],nums[p]);
        } 
        
        int j= p+1;
        reverse(nums.begin()+j,nums.end());
    }
};