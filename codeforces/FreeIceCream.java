import java.util.Scanner;

public class FreeIceCream{

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		long packs = input.nextInt();
		int distress = 0;
		String plus = "+";
		
		for(int i = 0; i < n; i++){
			String operation = input.next();
			long queuePacks = input.nextInt();
			if(operation.equals(plus)){
				packs += queuePacks;
			}
			else {
				if(packs < queuePacks){
					distress++;
				}else{
				   packs -= queuePacks;
				}
				
			}
		}
		
		System.out.println(packs + " " + distress);
	}
}