class Solution {
    public int subtractProductAndSum(int n) {
        int productNumbers = 1;
        int totalNumbers = 0;
        while (n > 0) {
            totalNumbers += n % 10;
            productNumbers *= n % 10;
            n /= 10;
        }

        return productNumbers - totalNumbers;
    }
}