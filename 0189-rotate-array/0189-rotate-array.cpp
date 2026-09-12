class Solution {
public:
    void rotate(vector<int>& nums, int k) {
            k=k%nums.size();
        // reverse(nums.begin(),nums.end());
        // reverse(nums.begin(),nums.begin()+k);
        // reverse(nums.begin()+k,nums.end());
        vector<int> arr;
        for(int i=nums.size()-k;i<nums.size();i++){
            arr.push_back(nums[i]);


            // int val=nums[nums.size()-1];
            // cout<< nums.size()<<" "<<nums.back()<<" "<<val<<endl;
            // nums.insert(nums.begin(),val);

        }
        arr.insert(arr.end(),nums.begin(),nums.end()-k);
        nums=arr;

        // for(int i=0;i<k;i++) nums.pop_back();
    }
};