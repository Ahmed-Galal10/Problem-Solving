class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedWord = new StringBuilder();
        int word1Length = word1.length();
        int word2Length = word2.length();
        int i = 0, j = 0;

        while (i < word1Length || j < word2Length){
            if (i < word1Length){
               mergedWord.append(word1.charAt(i++));
            }
            if (j < word2Length){
                mergedWord.append(word2.charAt(j++));
            }
        }

        return mergedWord.toString();
    }
}