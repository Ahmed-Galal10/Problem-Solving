class IsPalindrome{
    public boolean isPalindrome(int currentNum) {
        int originalNumber = currentNum;
        int reverse = 0;
        while (currentNum > 0){
            reverse = (reverse * 10) + (currentNum % 10);
            currentNum /= 10;
        }

        return reverse == originalNumber;
    }
}