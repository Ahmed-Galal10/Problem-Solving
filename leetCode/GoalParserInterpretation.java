class Solution {
    public String interpret(String command) {
        int i = 0;
        StringBuilder goalParser = new StringBuilder();
        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                goalParser.append('G');
                i++;
            } else if (command.charAt(i + 1) == ')') {
                goalParser.append('o');
                i += 2;
            } else {
                goalParser.append("al");
                i += 4;
            }
        }

        return goalParser.toString();
    }
}