import java.lang.Math;
class Solution {
    public int mySqrt(int x) {
        double y=Math.sqrt(x);
        double res=Math.floor(y);
        return (int)res;
        
    }
}