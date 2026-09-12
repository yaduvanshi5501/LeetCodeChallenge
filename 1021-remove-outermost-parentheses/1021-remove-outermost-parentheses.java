class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int n = 0;
        for(char x:s.toCharArray()){
            if(x=='('){
                if(n>0) ans.append(x);
                n++;
            }
            else{
                n--;
                if(n>0) ans.append(x);
            }
        }

        return ans.toString();
    }
}