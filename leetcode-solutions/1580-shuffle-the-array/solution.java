class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] r = new int[2*n];
        int index=0;
        for(int i=0;i<n;i++)
            {
                r[index++]=nums[i];
                r[index++]=nums[i+n];
            }
        return r;
    }
}
