class Solution {
    public int[] searchRange(int[] nums, int target) {
        int right =nums.length;

        int left=0;
        while(left < right){
            int mid= left + (right-left)/2;

            if(nums[mid] >= target) right = mid;
            else left = mid+1;


        }

        if(left == nums.length || nums[left] != target) return new int[]{-1,-1};

        int ans1=left;

        left=0;
        right = nums.length;
        while(left < right){
            int mid = left + (right-left)/2;

            if(nums[mid] > target) right=mid;
            else left = mid+1;

            System.out.println(left +" "+mid +" " + right);
        }

        int ans2 = left ;
        return new int[]{ans1,ans2-1};
    }
}