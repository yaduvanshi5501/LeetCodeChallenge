class Solution {
    public String reverseWords(String s) {

        String ans = "";
        StringBuilder word = new StringBuilder();

        for (char x : s.toCharArray()) {

            if (x == ' ') {

                if (word.length() != 0) {
                    if (ans.length() == 0)
                        ans = word.toString();
                    else
                        ans = word.toString() + " " + ans;

                    word.setLength(0);
                }

            } else {
                word.append(x);
            }
        }

        // Process last word
        if (word.length() != 0) {
            if (ans.length() == 0)
                ans = word.toString();
            else
                ans = word.toString() + " " + ans;
        }

        return ans;
    }
}