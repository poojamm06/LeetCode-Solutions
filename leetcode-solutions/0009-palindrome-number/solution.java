class Solution {
    public boolean isPalindrome(int x) {
        int org=x,rev=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int num=x%10;
            rev=rev*10+num;
            x/=10;
        }
        if(rev==org){
            return true;
        }
        else{
            return false;
        }
    }
}
