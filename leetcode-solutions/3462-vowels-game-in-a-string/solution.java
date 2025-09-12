class Solution {
    public boolean doesAliceWin(String s) {
        String vowels="AEIOUaeiou";
        for(char c:s.toCharArray()){
            if(vowels.indexOf(c)>=0){
                return true;
            } 
        }
        return false;
    }
}
