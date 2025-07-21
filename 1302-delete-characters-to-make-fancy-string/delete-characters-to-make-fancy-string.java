class Solution {
    public String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            int len = res.length();
            if (len >= 2 && res.charAt(len - 1) == c && res.charAt(len - 2) == c) {
                continue;
            }
            res.append(c);
        }
        return res.toString();
    }
}