class Solution {
    public int reversePairs(int[] nums) {
        
        return mergeSort(nums,0,nums.length-1);
    }

    int mergeSort(int[] nums, int low , int high){
        
        if(low >= high) return 0;

        int mid = low + (high-low)/2;

        int cnt = 0;

        cnt += mergeSort(nums,low,mid);
        cnt += mergeSort(nums,mid+1,high);

        // count reverse pair
        int j= mid + 1;

        for(int i = low;i <= mid;i++){
            while(j <= high && nums[i] > 2L * nums[j]){
                j++;
            }
            cnt += j - (mid + 1);
        }

        // Normal merge
        int[] temp = new int[high - low +1];
        

        int i = low;
        j = mid + 1;
        int k =0;

        while(i<=mid && j<=high){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];

            }
        }

        while (i <= mid) 
            temp[k++] = nums[i++]; 
 
        while (j <= high) 
            temp[k++] = nums[j++]; 
 
        for (i = low; i <= high; i++) { 
            nums[i] = temp[i - low]; 
        } 

        return cnt;

    }
}