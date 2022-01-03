class PalindromeNumber {
    public boolean isPalindrome(int num) {
        //let num = 131
        int inputNum = num;
        int reverse = 0;
        
        while(num > 0){
            reverse = (reverse * 10) + num % 10;
            //1 - 13 - 131
            num /= 10;
            //13 - 1 - 0
        }
        return (inputNum == reverse);
    }
}