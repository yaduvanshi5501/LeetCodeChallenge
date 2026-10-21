class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
       String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
       
       solve(0, new StringBuilder(),digits, map);
       return ans;

    }
    private void solve(int idx, StringBuilder temp, String digits, String[] map){
        if(idx == digits.length()){
            ans.add(temp.toString());
            return;
        }

        String letters = map[digits.charAt(idx) - '0'];

        for(int i=0; i<letters.length(); i++){
            temp.append(letters.charAt(i));

            solve(idx+1, temp, digits, map);

            temp.deleteCharAt(temp.length()-1);
            
        }
    }
}