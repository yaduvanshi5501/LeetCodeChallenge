class Solution {
public:
    void sortColors(vector<int>& nums) {
        int arr[3]={0};
        for(int a:nums) arr[a]++;

        int i=0;
        for(int j=0;j<arr[0];j++)   nums[i++]=0;
        for(int j=0;j<arr[1];j++)   nums[i++]=1;
        for(int j=0;j<arr[2];j++)   nums[i++]=2;
    }
};