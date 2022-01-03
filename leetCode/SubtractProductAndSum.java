class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        String digits = String.valueOf(n); 
        int product = 1;
        int sum = 0;
        
        for(int i = 0; i < digits.length(); i++){
            product *= Integer.parseInt(String.valueOf(digits.charAt(i)));
            sum += Integer.parseInt(String.valueOf(digits.charAt(i)));
        }s
        
        return product - sum;
    }
}