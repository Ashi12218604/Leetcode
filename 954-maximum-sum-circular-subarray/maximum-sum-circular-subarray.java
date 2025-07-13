class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int mins=Integer.MAX_VALUE,maxs=Integer.MIN_VALUE,
        currmx=0,currmn=0,total=0;
        for(int num:nums)
        {
            currmx=Math.max(num,currmx+num);
            maxs=Math.max(maxs,currmx);
            currmn=Math.min(num,currmn+num);
            mins=Math.min(mins,currmn);
            total+=num;
        }
        if(maxs<0)
        {
            return maxs;
        }
        return Math.max(maxs,total-mins);
    }
}