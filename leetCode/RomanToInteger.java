class RomanToInteger {
    public int romanToInt(String romanNumber) {
        Map<Character, Integer> romansLetters = new HashMap<>();

        romansLetters.put('I', 1);
        romansLetters.put('V', 5);
        romansLetters.put('X', 10);
        romansLetters.put('L', 50);
        romansLetters.put('C', 100);
        romansLetters.put('D', 500);
        romansLetters.put('M', 1000);

        int normalNumberResult = 0;
        for (int i = 0; i <= romanNumber.length() - 1; i++) {
                if (i < romanNumber.length() - 1) {
                    int dividedFollowedTwoNumbers =
                        romansLetters.get(romanNumber.charAt(i + 1)) / romansLetters.get(romanNumber.charAt(i));
                    if (romansLetters.get(romanNumber.charAt(i + 1)) / romansLetters.get(romanNumber.charAt(i)) == 5 
                        || romansLetters.get(romanNumber.charAt(i + 1)) / romansLetters.get(romanNumber.charAt(i)) == 10) {
                        normalNumberResult += romansLetters.get(romanNumber.charAt(i + 1)) - romansLetters.get(romanNumber.charAt(i));
                        i++;
                    } else {
                        normalNumberResult += romansLetters.get(romanNumber.charAt(i));
                    }
                } else {
                    normalNumberResult += romansLetters.get(romanNumber.charAt(i));
                }
        }

        return normalNumberResult;
    }
}