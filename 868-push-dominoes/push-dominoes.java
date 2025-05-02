class Solution {
    public String pushDominoes(String dominoes) {
        // Add virtual dominoes at boundaries
        String s = "L" + dominoes + "R";
        int n = s.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0, j = 1; j < n; j++) {
            if (s.charAt(j) == '.') continue;

            int mid = j - i - 1;

            // Add the left boundary if not virtual
            if (i > 0) result.append(s.charAt(i));

            // Case 1: Same direction (e.g., L...L or R...R)
            if (s.charAt(i) == s.charAt(j))
                result.append(String.valueOf(s.charAt(i)).repeat(mid));
            // Case 2: Opposite outwards (e.g., L...R)
            else if (s.charAt(i) == 'L' && s.charAt(j) == 'R')
                result.append(".".repeat(mid));
            // Case 3: Opposite inwards (R...L)
            else {
                int half = mid / 2;
                result.append("R".repeat(half));
                if (mid % 2 == 1) result.append('.');
                result.append("L".repeat(half));
            }

            i = j;
        }

        return result.toString();
    }
}