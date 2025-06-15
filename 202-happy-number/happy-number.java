class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen=new HashSet<>();
        while(n!=1 && !seen.contains(n))
        {
            seen.add(n);
            int s=0;
            while(n>0)
            {
            int d=n%10;
            s+=d*d;
            n=n/10;
        }
        n=s;
        }
        return n==1;
    }
}