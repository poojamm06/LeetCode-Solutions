import java.util.*;
class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        

        Set<String> exactSet = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> caseMap = new HashMap<>();   // lowercase -> first original
        Map<String, String> vowelMap = new HashMap<>();  // devowel(lowercase) -> first original

        for (String w : wordlist) {
            String lower = w.toLowerCase();
            caseMap.putIfAbsent(lower, w);
            String dev = devowel(lower);
            vowelMap.putIfAbsent(dev, w);
        }

        String[] ans = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];
            if (exactSet.contains(q)) {
                ans[i] = q;                               // exact (case-sensitive)
                continue;
            }

            String lowerQ = q.toLowerCase();
            if (caseMap.containsKey(lowerQ)) {
                ans[i] = caseMap.get(lowerQ);            // case-insensitive match
                continue;
            }

            String devQ = devowel(lowerQ);
            if (vowelMap.containsKey(devQ)) {
                ans[i] = vowelMap.get(devQ);             // vowel-error match
            } else {
                ans[i] = "";                             // no match
            }
        }
        return ans;
    }

    // Replace vowels by a placeholder (e.g. '*') for canonicalization
    private String devowel(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            if (isVowel(c)) sb.append('*');
            else sb.append(c);
        }
        return sb.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    

    }
}
