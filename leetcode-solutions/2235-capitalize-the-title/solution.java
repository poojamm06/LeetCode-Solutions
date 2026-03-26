class Solution {
    public String capitalizeTitle(String title) {
        String[] words=title.split(" ");
        for(int i=0;i<words.length;i++){
            String w=words[i];
            if(w.length()==1 || w.length()==2){
               words[i]= w.toLowerCase();
            }
            else{
                words[i]=Character.toUpperCase(w.charAt(0)) + w.substring(1).toLowerCase();
            }

        }
        String result=String.join(" ",words);
        return result;
    }
}
