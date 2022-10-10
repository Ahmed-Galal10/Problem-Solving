class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int numJewels = 0;
		
        for(char stone : stones.toCharArray()){
            if(jewels.contains(Character.toString(stone))) {
                numJewels++;
            }
        }
        return numJewels;    
    }
}