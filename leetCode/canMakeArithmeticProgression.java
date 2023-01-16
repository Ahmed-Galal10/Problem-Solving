class Solution {
    public boolean canMakeArithmeticProgression(int[] numbers) {
        Arrays.sort(numbers);
        int difference = numbers[1] - numbers[0];
        for (int i = numbers.length - 1; i >= 2 ; i--){
            if (numbers[i] - numbers[i-1] != difference){
                return false;
            }
        }
        return true;
    }
}