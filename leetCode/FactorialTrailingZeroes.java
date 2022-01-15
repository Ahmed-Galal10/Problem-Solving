class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        if(n <= 2){
            return 0;
        }
        
        int res = n * trailingZeroes(n - 1);
        return (res % 10) == 0 ;  
    }
}