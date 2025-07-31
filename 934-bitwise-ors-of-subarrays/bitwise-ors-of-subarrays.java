import java.util.HashSet;
import java.util.Set;

class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> resultOrs = new HashSet<>();
        Set<Integer> currentOrs = new HashSet<>();
        for (int x : arr) {
            Set<Integer> nextOrs = new HashSet<>();
            nextOrs.add(x);
            for (int y : currentOrs) {
                nextOrs.add(x | y);
            }
            resultOrs.addAll(nextOrs);
            currentOrs = nextOrs;
        }
        return resultOrs.size();
    }
}