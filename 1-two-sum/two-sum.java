class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> sh=new HashMap<>();
    for(int i=0;i<nums.length;i++)
    {
    int l=target-nums[i];
    if(sh.containsKey(l))
    {
    return new int[]{sh.get(l),i};
    }
    sh.put(nums[i],i);
    }
    return new int[] {-1,-1};
    }
}