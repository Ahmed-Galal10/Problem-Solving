class Solution {
     public String smallestEquivalentString(String s1, String s2, String baseStr)
    {
        StringBuilder resultString = new StringBuilder();
        int[] AlphaChars = new int[26];
        for(int i = 0; i < 26; i++){
            AlphaChars[i] = i;
        }
        
        for(int i = 0; i < s1.length(); i++)
        {
            int charIFromFirstStr = s1.charAt(i) - 'a';
            int charIFromSecondStr = s2.charAt(i) - 'a';
            int end1 = findIndex(AlphaChars, charIFromFirstStr);
            int end2 = findIndex(AlphaChars, charIFromSecondStr);
            if(end1 < end2) {
                AlphaChars[end2] = end1;
            } else {
                AlphaChars[end1] = end2;
            }
        }
        
        for(int i = 0; i < baseStr.length(); i++)
        {
            char c = baseStr.charAt(i);
            resultString.append((char)('a' + findIndex(AlphaChars, c - 'a')));
        }
        return resultString.toString();
    }

    private int findIndex(int[] AlphaChars, int charIndex)
    {
        while(AlphaChars[charIndex] != charIndex)
        {
            charIndex = AlphaChars[charIndex];
        }
        return charIndex;
    }
}