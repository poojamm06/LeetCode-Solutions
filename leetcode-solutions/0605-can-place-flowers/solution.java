class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l=flowerbed.length;
        for(int i=0;i<l;i++){
            if(flowerbed[i]==0){
                boolean left=(i==0 || flowerbed[i-1]==0);
            boolean right=(i==(l-1) || flowerbed[i+1]==0);
            if(left && right){
                flowerbed[i]=1;
                n-=1;
            }
            }
        }
        return n<=0;
    }
}
