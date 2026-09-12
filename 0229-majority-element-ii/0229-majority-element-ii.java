class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n=nums.length;

        int ans1=0;
        int ans2=0;
        int c1=0;
        int c2=0;

        for(int i=0;i<n;i++){
            if(ans1==nums[i]){
                c1++;
            }else if(ans2==nums[i]){
                c2++;
            }
            else if(c1==0){
                ans1=nums[i];
                c1++;
            }else if(c2==0){
                ans2=nums[i];
                c2++;
            }else{
                c1--;
                c2--;
            }
        }

        c1=0;
        c2=0;
        for(int a:nums){
            if(ans1==a) c1++;
            else if(ans2==a) c2++;
        }

        List<Integer> ans=new ArrayList<>();

        if(c1>n/3) ans.add(ans1);
        if(c2>n/3) ans.add(ans2);

        return ans;

    }
}