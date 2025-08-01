class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        n1=len(s)
        n2=len(t)
        if(n1!=n2):
            return False
        l1=list(s)
        l2=list(t)
        l1.sort()
        l2.sort()
        for i in range(len(l1)):
            if(l1[i]!=l2[i]):
                return False
        return True
        
        