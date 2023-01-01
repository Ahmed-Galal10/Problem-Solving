class checkIfTheSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26){
            return false;
        }

        SortedSet<Character> sortedChars = new TreeSet<>();

        for (Character ch : sentence.toCharArray()){
            sortedChars.add(ch);
        }

        return (sortedChars.size() == 26);
    }
}