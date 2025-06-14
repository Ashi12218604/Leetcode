class Solution {
    public int minMaxDifference(int num)
     {
        String s = Integer.toString(num);
        char ch = '\0';
        for (char c : s.toCharArray()) 
        if (c != '9') { ch = c;
         break; }
        String mx;
        if (ch != '\0')
         {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray())
             sb.append(c == ch ? '9' : c);
            mx = sb.toString();
        } else {
            mx = s;
        }
        char ch0 = s.charAt(0);
        StringBuilder sb2 = new StringBuilder();
        for (char c : s.toCharArray()) 
        sb2.append(c == ch0 ? '0' : c);
        String mn = sb2.toString();
        return Integer.parseInt(mx) - Integer.parseInt(mn);
    }
}