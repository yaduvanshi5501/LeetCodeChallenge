class Solution {
    public int[] rearrangeArray(int[] nums) {
        int s= nums.length;
        int[] arr=new int[s];
        int p=0,n=1;
        for(int i=0;i<s;i++){
            if(nums[i]>=0){
                arr[p]=nums[i];
                p+=2;
            }else{
                arr[n]=nums[i];
                n+=2;
            }
        }
        return arr;
    }
}