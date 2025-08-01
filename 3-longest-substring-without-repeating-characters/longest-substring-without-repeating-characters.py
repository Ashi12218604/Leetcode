class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        sh=set()
        l=0
        maxlen=0
        for r in range(len(s)):
            while s[r] in sh:
                sh.remove(s[l])
                l=l+1
            sh.add(s[r])
            maxlen=max(maxlen,r-l+1)
        return maxlen
        