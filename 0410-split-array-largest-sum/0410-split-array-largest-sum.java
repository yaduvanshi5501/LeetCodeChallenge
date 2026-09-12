class Solution {
    public int splitArray(int[] nums, int k) {

        int sum = 0;
        int left = 0;

        for (int x : nums) {
            sum += x;
            left = Math.max(left, x);
        }
        int right = sum;

        while(left < right){

            int mid = left + (right-left)/2;
            
            int subSum  = 0;
            int subArrays = 1;

            for(int x:nums){
                if(subSum+x > mid){
                    subArrays++;
                    subSum = x;
                }else subSum+=x;
            }

            if(subArrays > k) left = mid+1;
            else   right = mid;      
        }

        return left;
        
    }
}