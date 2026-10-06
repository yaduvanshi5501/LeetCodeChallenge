class Solution {
    public double myPow(double x, int n) {
        long N = Math.abs((long)n);

        // if (N < 0) {
        //     return 1.0/power(x,-N);
        // }

        // return power(x, N);
        double ans= power(x,N);
        if(n<0){
            return 1.0/ans;
        }
        return ans;
    }

    private double power(double x, long n) {
        if (n == 0) {
            return 1.0;
        }

        double result = power(x, n / 2);
        result = result * result;

        if (n % 2 == 1) {
            result = result * x;
        }

        return result;
    }
}