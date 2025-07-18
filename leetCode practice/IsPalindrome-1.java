class Scratch {
    public static void main(String[] args) {
        int x = 10;

        System.out.println(isPalindrome(x));

    }

    public static boolean isPalindrome(int x) {
        String intWord = String.valueOf(x);
        int intLength = intWord.length() - 1;
        for (int i = 0; i <= intLength / 2; i++) {
            if (intWord.charAt(i) != intWord.charAt(intLength - i)){
                return false;
            }
        }

        return true;
    }
}