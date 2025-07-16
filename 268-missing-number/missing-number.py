class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n=len(nums)
        ssum=(n*(n+1))//2
        Tsum=sum(nums)
        return ssum-Tsum
        