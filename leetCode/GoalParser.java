class GoalParser {
    public String interpret(String command) {
		
		// return command.replace("()", "o").replace("(al)", "al");
		
        StringBuilder commandParser = new StringBuilder();
        
        for(int i = 0; i < command.length(); i++){
            if (command.charAt(i) == '('){
                if (command.charAt(i+1) == ')'){
                    commandParser.append('o');
                    i++;
                }else {
                    commandParser.append("al");
                    i += 3;
                }
            } else {
                commandParser.append(command.charAt(i));
            }
        }
        
        return commandParser.toString();
    }
}