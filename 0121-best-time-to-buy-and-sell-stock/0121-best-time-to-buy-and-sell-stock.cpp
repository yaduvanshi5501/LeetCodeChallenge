class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int buy=prices[0];
        int p = 0;

        for(int i=1;i<prices.size();i++){
            if(prices[i]>buy) {
                p=max(prices[i]-buy,p);
            }else{
                buy=prices[i];
            }
        }
        
        return p;
    }
};