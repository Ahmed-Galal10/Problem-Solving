import java.util.Scanner;


public class AlmostPrime {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int result = getAlmostPrimes(n);
		
		System.out.println(result);
	}
	
	public static int getAlmostPrimes(int n){
		int counter = 0;
		int almostPrimes = 0;
		
		for(int i = 2; i <= n; i++){
			if(!isPrime(i)){
				for(int j = 2; j < i; j++){

					if( isPrime(j) && (i % j == 0) ){
						counter++;
					}
				}
				if(counter == 2){
					almostPrimes++;
					counter = 0;
				}
				counter = 0;
			}
		}

		return almostPrimes;
	}
	
	public static boolean isPrime(int n){
		
		if(n == 2){
			return true;
		}
		
		else if( (n <= 1) || (n % 2 == 0) ){
			return false;
		}
		
		for(int i = 3; i <= (n * 0.5) ; i += 2){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
}