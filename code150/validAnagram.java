// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] c = new int[26];

        if(s.length() != t.length()){
            return false;
        }

        for(int i=0; i<s.length(); i++){
            c[s.charAt(i) - 'a'] += 1;
        }
        for(int j=0; j<t.length(); j++){
            if(c[t.charAt(j) - 'a'] == 0){
                return false;
            }
            c[t.charAt(j) - 'a'] -= 1;
        }
        return true;
    }
}
