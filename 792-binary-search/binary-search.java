class Solution {
    public int search(int[] nums, int target) {
        int lb=0,ub=nums.length-1,mid=0;
        while(lb<=ub)
        {
            mid=(lb+ub)/2;
            if(nums[mid]==target)
            return mid;
            else if(target>nums[mid])
            lb=mid+1;
            else
            ub=mid-1;
        }
        return -1;
    }
}