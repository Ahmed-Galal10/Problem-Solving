class Solution {
    public int minDeletionSize(String[] words) {
        if(words.length == 0 || words == null){
            return 0;
        }

        int deletedStr = 0;
        for (int column = 0; column < words[0].length(); column++){
            char currentChar = words[0].charAt(column);
            for (int word = 0; word < words.length; word++){
                if( currentChar > words[word].charAt(column)){
                    deletedStr++;
                    break;
                }
                currentChar = words[word].charAt(column);
            }
        }

        return deletedStr;
    }
}