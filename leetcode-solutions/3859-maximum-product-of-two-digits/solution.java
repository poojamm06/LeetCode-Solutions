class Solution {
    public int maxProduct(int n) {
        int max=-1,s_max=-1;
        while(n!=0){
            int rem=n%10;
            if(rem>max){
                s_max=max;
                max=rem;
            }
            else if (rem>s_max){
                s_max=rem;
            }
            n/=10;
        }
        return max*s_max;
    }
}
