class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if(nums1.length > nums2.length)
            return findMedianSortedArrays(nums2,nums1);

        int n1= nums1.length;
        int n2=nums2.length;

        int total = n1+n2;
        int half = (total + 1)/2;

        int left = 0;
        int right = n1;

        while(left <= right){
            int i = left +(right-left)/2;
            int j = half - i;

            int left1 = (i==0) ? Integer.MIN_VALUE:nums1[i-1];
            int right1 =(i==n1) ? Integer.MAX_VALUE:nums1[i];

            int left2 = (j==0) ? Integer.MIN_VALUE:nums2[j-1];
            int right2 = (j==n2) ? Integer.MAX_VALUE:nums2[j];

            if(left1 <= right2 && left2 <= right1){
                if(total %2 !=0) return Math.max(left1,left2);
                else    return (Math.max(left1,left2)+Math.min(right1,right2))/2.0;
            }

            if(left1 > right2) right = i-1;
            else left = i+1;
        }

        return 0.0;
    }
}