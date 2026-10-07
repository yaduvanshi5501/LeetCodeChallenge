class Solution {

    long MOD = 1_000_000_007;
    
    public int countGoodNumbers(long n) {

        long odd = (n+1)/2;
        long even = n/2;
     
        long evenans = pow(5,odd);
        long oddans = pow(4,even);

        return (int)((evenans * oddans)%MOD);
    }

    private long pow(long val,long n){

        if(n==0) return 1;

        long result = pow(val, n/2);
        result = (result * result) % MOD;

        if(n%2 !=0){
            result = (result * val) % MOD;
        }
        return result;
    }

}