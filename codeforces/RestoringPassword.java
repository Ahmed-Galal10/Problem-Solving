import java.util.*;
 
 
public class RestoringPassword{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		String allBinCode =  input.next();
		List<String> codesList = splitStrBySize(allBinCode, 10);
		
		Map<String, String> numbersMap = new HashMap<String, String>();
		for(int i = 0; i < 10; i++){
			String binCode = input.next();
			numbersMap.put(binCode, String.valueOf(i));
		}
		
		StringBuilder resultCode = getMatchedCode(codesList, numbersMap);
		System.out.println(resultCode);
		
	}
	
	
	public static List<String> splitStrBySize(String str, int Size){
		List<String> codesList = new ArrayList<>();
		
		for (int i = 0; i < str.length(); i += Size) {
			codesList.add(str.substring(i, i + Size));
        }
		
		return codesList;
	}
	
	public static StringBuilder getMatchedCode(List<String> codesList, Map<String, String> numbersMap){
		StringBuilder resultCode = new StringBuilder();
		
		for(String code : codesList){
			for(Map.Entry<String,String> entry : numbersMap.entrySet()){
				if(code.equals(entry.getKey())){
					resultCode.append(entry.getValue());
					break;
				}
			}
		}
		
		return resultCode;
	}
	
}