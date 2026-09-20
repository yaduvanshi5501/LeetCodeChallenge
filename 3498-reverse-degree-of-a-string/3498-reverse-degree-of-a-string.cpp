class Solution {
public:
    int reverseDegree(string s) {
        int sum=0;
        for(int i=0;i<s.size();i++){
            int ridx=s[i]-96;
            sum+=((i+1)*(27-ridx));
        }
        return sum;
    }
};