class Solution {
    public boolean isPalindrome(int x) {
    StringBuilder reverse = new StringBuilder();
        String digits = String.valueOf(x);

        for (int i = digits.length() - 1; i = 0; i--){
            reverse.append(digits.charAt(i));
        }

        return x == Integer.valueOf(reverse.toString());
    }
}