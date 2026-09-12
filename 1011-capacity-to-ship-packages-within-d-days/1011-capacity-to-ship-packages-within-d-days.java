class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        for(int x:weights){
            sum+=x;
        }
        // int left = Math.max(Arrays.stream(weights).max().getAsInt(),(sum+days-1)/days);
        int left = Math.max(Arrays.stream(weights).max().getAsInt(),(int)Math.ceil((double)sum/days));

        int right = sum;

        while(left < right){
            int mid = left + (right-left)/2;

            int wt = 0;
            int rd=1;
            for(int x:weights){
                if(wt+x > mid){
                    rd++;
                    wt=0;
                }
                wt+=x;
                
            }

            if(rd > days) left=mid+1;
            else right = mid;
        }
        return left;
    }
}