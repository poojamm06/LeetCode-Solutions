import java.util.*;
class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        Set<Character> vowels=Set.of('a','e','i','o','u');
        int maxv=0,maxc=0;
        for(int i=0;i<26;i++){
            if(vowels.contains((char)(i+'a'))){
                maxv=Math.max(maxv,freq[i]);
            } else{
                maxc=Math.max(maxc,freq[i]);
            }
        }
        return maxv+maxc;
       
    }
}
