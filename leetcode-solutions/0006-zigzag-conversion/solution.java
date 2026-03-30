class Solution {
    public String convert(String s, int numRows) {
          if(numRows==1) return s;
          StringBuilder[] rows=new StringBuilder[numRows];
          for(int j=0;j<numRows;j++){
            rows[j]=new StringBuilder();
          }
          int i=0;
          boolean godown=true;
          for(char c:s.toCharArray()){
            rows[i].append(c);
            if(i==0) godown=true;
            else if(i==numRows-1) godown=false;
            if(godown==true)
            i+=1;
            else i-=1;
          }
          StringBuilder result=new StringBuilder();
          for(StringBuilder row:rows){
            result.append(row);
          }
          return result.toString();
    
    }
}
