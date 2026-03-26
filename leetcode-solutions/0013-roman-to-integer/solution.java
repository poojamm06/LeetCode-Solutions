class Solution {
    public int romanToInt(String s) {
        int tot=0;
        for(int i=s.length()-1;i>=0;i--){
          int  value=getvalue(s.charAt(i));
          if(i<s.length()-1 && value<getvalue(s.charAt(i+1))){
            tot-=value;
          }
          else{
            tot+=value;
          }

                
            
        }
        return tot;
    }

private int getvalue(char ch){
    switch(ch){
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default: return 0;
    }
}
}
