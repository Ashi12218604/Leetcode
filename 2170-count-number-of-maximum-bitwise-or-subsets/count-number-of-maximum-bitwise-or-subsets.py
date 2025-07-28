class Solution:
    def countMaxOrSubsets(self, nums: List[int]) -> int:
        n = len(nums)
        max_or = 0
        for num in nums:
            max_or |= num
        
        count = 0
        total = 1 << n 
        for mask in range(1, total): 
            curr_or = 0
            for i in range(n):
                if (mask & (1 << i)) != 0:
                    curr_or |= nums[i]
            if curr_or == max_or:
                count += 1
        return count