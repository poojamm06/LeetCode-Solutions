class Solution {
    public int arraySign(int[] nums) {
       double m=1;
        for(int i:nums){
            m*=i;
        }
        if(m>0){
            return 1;
        }
        else if (m<0){
            return -1;
        }
        else {
            return 0;
        }
     
    }
}
