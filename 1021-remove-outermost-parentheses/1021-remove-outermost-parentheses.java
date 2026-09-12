class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int n = 0;
        for(char x:s.toCharArray()){
            if(x=='(') n++;
            else n--;
            if(n>1){
                ans.append(x);
            }
            else if(n!=0 && x==')') ans.append(x);
        }

        return ans.toString();
    }
}