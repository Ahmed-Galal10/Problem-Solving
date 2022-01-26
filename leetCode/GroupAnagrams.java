import java.util.List;
import java.util.HashMap;


class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> anagramTable = new HashMap<>();

        for (int i = 0; i < strs.length; i++){
            char[] charListWord = strs[i].toCharArray();
            Arrays.sort(charListWord);
            String anagram = String.valueOf(charListWord);
            
            if(!anagramTable.containsKey(anagram)){
                anagramTable.put(anagram, new ArrayList<>());
            }

            anagramTable.get(anagram).add(strs[i]);
        }
        
        return new ArrayList<>(anagramTable.values());
    }
}