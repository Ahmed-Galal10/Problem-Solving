import java.util.*;

class ValidParentheses {
    public boolean isValid(String s) {
        Hashtable<Character, Character> bracketsTable = new Hashtable<Character, Character>();
        bracketsTable.put(')', '(');
        bracketsTable.put('}', '{');
        bracketsTable.put(']', '[');

        Stack<Character> bracketStack = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++){
            char bracket = s.charAt(i);
            if(bracketsTable.containsKey(bracket)){
                char popBracket = bracketStack.empty() ? '#' : bracketStack.pop();
                
                if(popBracket != bracketsTable.get(bracket)){
                    return false;
                }
            } else {
                bracketStack.push(s.charAt(i));
            }
        }
        
        return bracketStack.isEmpty();
    }
}