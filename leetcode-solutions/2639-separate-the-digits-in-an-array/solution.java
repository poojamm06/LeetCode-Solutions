class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Stack<Integer>  stk= new Stack<>();
        for(int i:nums){
            int temp=i;
            while(temp>0){
                stk.push(temp%10);
                temp/=10;
            }
            while(!stk.isEmpty()){
                list.add(stk.pop());
            }
            
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<=list.size()-1;i++){
            arr[i]=list.get(i);
        }
 
 return arr;       
    }
}
