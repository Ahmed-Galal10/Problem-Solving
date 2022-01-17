import java.util.*;

class ValidParentheses {
    public boolean isValid(String s) {
        Hashtable<Character, Character> bracketsTable = new Hashtable<Character, Character>();
        bracketsTable.put(')', '(');
        bracketsTable.put('}', '{');
        bracketsTable.put(']', '[');

        Stack<Character> bracketStack = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++){
            
            if(bracketsTable.containsKey(s.charAt(i))){
                int pop = bracketStack.pop();
                
                if(pop != bracketsTable.get(s.charAt(i))){
                    return false;
                }
            } else {
                bracketStack.push(s.charAt(i));
            }
        }
        
        return bracketStack.isEmpty();
    }
}