public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return new String("");
        if (strs.length == 1)
            return strs[0];
        StringBuilder prefix = new StringBuilder();
        char c = 0;
        outer:
        for (int p = 0; p < strs[0].length(); p++) {
            for (int i = 0; i < strs.length; i++) {
                if (p == strs[i].length())
                    break outer;
                if (i == 0) {
                    c = strs[i].charAt(p);
                } else {
                    if (strs[i].charAt(p) != c)
                        break outer;
                    if (i == strs.length - 1)
                        prefix.append(c);
                }
            }
        }
        return prefix.toString();
    }
}
