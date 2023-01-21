class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphaChars = new int[26];
        for (char c : s.toCharArray()) {
            alphaChars[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            alphaChars[c - 'a']--;
        }

        for (int n : alphaChars) {
            if (n != 0){
                return false;
            }
        }

        return true;
    }
}