class Solution {
    public int climbStairs(int n) {
        if(n<2) return n;
       int a=2,b=1;
       for(int i=3;i<=n;i++){
        int temp=a+b;
        b=a;
        a=temp;
       }
       return a;
    }
}
