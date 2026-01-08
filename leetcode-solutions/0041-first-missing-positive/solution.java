import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i=1;
        for(int x:nums){
          if(x<=0) continue;
          else if(x==i) i++;
          else if(x>i) return i;
        }
        return i;
    }
}
