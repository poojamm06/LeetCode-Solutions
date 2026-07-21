class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            int min_index=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[min_index]){
                    min_index=j;
                }
            }
            if(min_index!=i){
                int temp=nums[min_index];
                nums[min_index]=nums[i];
                nums[i]=temp;
            }
        }
        return nums;
    }
}
