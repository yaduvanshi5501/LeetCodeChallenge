class Solution {

    long MOD = 1_000_000_007;
    
    public int countGoodNumbers(long n) {

        long odd = 0;
        long even = 0;
        if(n%2 ==0){
            odd = n/2;
            even = n/2;
        }else{
            n = n-1;
            odd = n/2+1;
            even = n/2;
        }

        long evenans = pow(5,odd);
        evenans = evenans % MOD;
        long oddans = pow(4,even);
        oddans = oddans % MOD;

        return (int)((evenans * oddans)%MOD);
    }

    private long pow(long val,long n){

        if(n==0) return 1;

        long result = pow(val, n/2);

        result = result %MOD;
        result = result * result;

        if(n%2 !=0){
            result = result * val;
        }
        
        return result;
    }

}