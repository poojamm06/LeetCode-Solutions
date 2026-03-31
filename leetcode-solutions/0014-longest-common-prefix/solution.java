class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        if(strs.length==0) {return "";}
        String first=strs[0];
        for(int i=0;i<first.length();i++){
            int count=0;
            char ch=first.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
                    return sb.toString();}
                   
                    
                   
                }
                sb.append(ch);
            }

        
        return sb.toString();

    }
}
