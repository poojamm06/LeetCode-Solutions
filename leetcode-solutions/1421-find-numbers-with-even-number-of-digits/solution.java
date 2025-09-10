class Solution {
    public int findNumbers(int[] nums) {
        
        int c,d=0;
        for(int i=0;i<nums.length;i++){
            c=0;
            int temp=nums[i];
            while(temp!=0){
                int x=temp%10;
                temp/=10;
                c++;
            }
            if(c%2==0){
                d++;
            }
        }
        return d;
      }
      
}
