class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0,dsum=0;
        for(int num:nums){
            if(num<10){
                sum+=num;
            } 
            else{
                dsum+=num;               
            }
        }
        if(sum!=dsum) return true;
        else return false;

    }
}
