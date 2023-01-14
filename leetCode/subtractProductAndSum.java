class Solution {
    public int subtractProductAndSum(int n) {
        int productNumbers = 1;
        int totalNumbers = 0;
        int x;
        String numberString = Integer.toString(n);

        for (int i = 0; i < numberString.length(); i++){
            x = numberString.charAt(i) - '0';
            productNumbers *= x;
            totalNumbers += x;
        }

        return productNumbers - totalNumbers;
    }
}