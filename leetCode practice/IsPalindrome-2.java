public class App {
    public static void main(String[] args) {
        int x = 12371;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        int currentNumber = x;
        int reversedNumber = 0;

        while (currentNumber > 0){
            reversedNumber = (reversedNumber * 10) + (currentNumber % 10);
            currentNumber /= 10;
        }

        return x == reversedNumber;
    }
}