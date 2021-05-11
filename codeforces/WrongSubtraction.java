import java.util.Scanner;


public class WrongSubtraction{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
        
        int subTimes = input.nextInt();
		
        for(int i = 0; i < subTimes; i++){
						
			if( (number % 10) != 0){
                number--;
            }
			else{
				number /= 10;
			}
		
        }
        
        System.out.println(number); 
    }
}