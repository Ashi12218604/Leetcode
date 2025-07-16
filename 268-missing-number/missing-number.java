class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,expectedsum=0,diff=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];

        }
         expectedsum=n*(n+1)/2; // since sum of range of 0 to n is n(n+1)/2
        diff=expectedsum-sum;
        return diff;
    }
}