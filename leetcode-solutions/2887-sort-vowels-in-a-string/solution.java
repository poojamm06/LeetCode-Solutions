class Solution {
    public String sortVowels(String s) {
       String vowels="AEIOUaeiou";
       List<Character> vowelList=new ArrayList<>();
       for(char c: s.toCharArray()){
        if(vowels.indexOf(c)!=-1){
            vowelList.add(c);
        }}
        Collections.sort(vowelList);
        StringBuilder vowel=new StringBuilder();
        int vowelindex=0;
        for(char c:s.toCharArray()){
            if(vowels.indexOf(c)!=-1){
                vowel.append(vowelList.get(vowelindex++));
            } else{
                vowel.append(c);
            }
        }
       
       return vowel.toString();
    }
}
