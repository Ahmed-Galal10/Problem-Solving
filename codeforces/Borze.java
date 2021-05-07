import java.util.*;


public class Borze{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String inputCode = input.next();
		
		System.out.println(transformCode(inputCode));

	}
	
	private static StringBuilder transformCode(String code){
		
		StringBuilder resCode = new StringBuilder();
		
		while(code.length() > 0){
			if(code.charAt(0) == '.'){
				resCode.append(0);
				code = code.substring(1);
			}
			else if(code.charAt(0) == '-'){
				int numCode = code.charAt(1) == '.' ? 1 : 2;
				resCode.append(numCode);
				code = code.substring(2);
			}
		}
		
		return resCode;
	}
}