class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)){
            return true;
        }
        char reservedChar1 = 0;
        int chances = 0;

        for (int i = 0; i < s1.length(); i++){
            if (chances > 1){
                return false;
            }
            if (s1.charAt(i) == s2.charAt(i)){
                continue;
            } else {
                if (s2.charAt(i) == reservedChar1){
                    return true;
                } else {
                    reservedChar1 = s1.charAt(i);
                    chances++;
                }
            }
        }

        return false;
    }
}