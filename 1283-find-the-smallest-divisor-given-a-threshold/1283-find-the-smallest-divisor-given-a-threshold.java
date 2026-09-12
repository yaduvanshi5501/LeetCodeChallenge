class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int l=1;
        int r=Arrays.stream(nums).max().getAsInt();
        while(l<r){
            int mid = l + (r-l)/2;

            int sum = 0;
            for(int x:nums){
                sum+= (x+mid -1)/mid;
            }

            if(sum <= threshold) r = mid;
            else l =mid +1;
        }

        return l;
        
    }
}