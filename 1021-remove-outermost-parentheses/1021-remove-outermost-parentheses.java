class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int n = 0;
        for(char x:s.toCharArray()){
            if(x=='(') n++;
            else n--;
            if(n>1){
                ans +=x;
            }
            else if(n!=0 && x==')') ans += x;
        }

        return ans;
    }
}