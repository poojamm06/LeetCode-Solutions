class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int l=0;
         int r=numbers.length-1;
         while(l<r){
            int current_sum=numbers[l]+numbers[r];
            if(current_sum==target){
                return new int[]{l+1,r+1};
            }
            else if(current_sum>target){
                r--;
            }
            else if (current_sum<target){
                l++;
            }
         }
         return new int[]{};
    }
}
