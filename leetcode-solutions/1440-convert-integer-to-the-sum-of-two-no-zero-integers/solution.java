class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr=new int[2];
        int i,j;
        for(i=1;i<n;i++){
            j=n-i;
            if(isnozero(i) && isnozero(j)){
                arr[0]=i;
                arr[1]=j;
                break;
            }
        }
        return arr;
    }
    private boolean isnozero(int n){
        while(n>0){
            if(n%10==0){
                return false;
            } n/=10;
        }return true;
    }
}
