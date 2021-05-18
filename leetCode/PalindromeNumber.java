class PalindromeNumber {
    public boolean isPalindrome(int num) {
        
        int inputNum = num;
        int reverse = 0;
        
        while(num > 0){
            reverse = (reverse * 10) + num % 10;
            num /= 10;
        }
        
        return (inputNum == reverse);
        
    }
    
}