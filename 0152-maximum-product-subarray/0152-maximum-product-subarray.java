class Solution {
    public int maxProduct(int[] nums) {
        int maxi=nums[0];
        int mini=nums[0];
        int ans =nums[0] ;

        for(int i=1;i<nums.length;i++){

            int newMaxi = Math.max(nums[i], Math.max( maxi * nums[i], mini * nums[i]));

            int newMini = Math.min(nums[i], Math.min(maxi * nums[i], mini * nums[i]));
        
            maxi= newMaxi;
            mini = newMini;
            ans = Math.max(ans,maxi);
        }
        return ans;
    }
}