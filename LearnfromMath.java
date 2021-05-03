import java.util.Scanner;


public class LearnfromMath{
	
	public static void main(String[] args){
	
		Scanner input  = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[] finalcompNum = getCompositeNum(n);
		
        System.out.println(finalcompNum[0] + " " + finalcompNum[1] );
		
	}
	
	public static boolean isComposite(int num){
		for(int i = 2; i < num; i++){
			if(num % i == 0){
				return true;
			}
		}
		return false;
	}
	
	public static int[] getCompositeNum(int num){
		int x = (int)(Math.random() * num);
		int y = num - x;
		
		if(isComposite(x) && isComposite(y)){
			int[] resNumbers = {x, y};
			return resNumbers;
		}else{
			return getCompositeNum(num);
		}
	}
}