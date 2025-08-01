class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        mapping={')':'(',']':'[','}':'{'}
        for char in s:
            if char in mapping:
                topelement=stack.pop() if stack else '#'
                if mapping[char]!=topelement:
                    return False
            else:
                stack.append(char)
        return not stack


        