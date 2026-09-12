class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n=nums.size()/2;
        int cnt=1, res=nums[0];
        //112333
        for(int i=1;i<nums.size();i++){
            if(res==nums[i]){
                cnt++;
            }else{
                cnt--;
            }
            if(cnt==0){
                res=nums[i];
                cnt++;
            }
        }
        return res;
        
    }
};