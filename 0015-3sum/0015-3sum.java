class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>arr=new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            
            // skip duplicate fixed elements 
            if(i>0 && nums[i]==nums[i-1]) continue;

            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int sum= nums[left] + nums[i] + nums[right];
                
                if(sum==0){
                    List<Integer> temp= new ArrayList<>();
                    arr.add(List.of(nums[i],nums[left],nums[right]));
            
                    left++;
                    right--;

                    // skip duplicate left value
                    while(left < right && nums[left]==nums[left-1]) left++;
                    // skip duplicate right value
                    while(right > left && nums[right]==nums[right+1]) right--; 
                } 

                else if(sum < 0) left++;

                else if(sum > 0) right--;


                    
            }
        }

        return arr;
        

    }
}