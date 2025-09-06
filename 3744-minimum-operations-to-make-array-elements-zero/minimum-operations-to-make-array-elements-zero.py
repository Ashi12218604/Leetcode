class Solution:
    def minOperations(self, queries: list[list[int]]) -> int:
        ans = 0
        for l, r in queries:
            S = 0
            dMax = 0
            for k in range(1, 32):
                low = 1 << (k - 1)
                high = (1 << k) - 1
                if low > r:
                    break
                a = max(l, low)
                b = min(r, high)
                if a > b:
                    continue
                cnt = b - a + 1
                stepsForK = (k + 1) // 2
                S += cnt * stepsForK
                dMax = max(dMax, stepsForK)
            ops = max(dMax, (S + 1) // 2)
            ans += ops
        return ans