import java.util.*;


public class PhoneCode{

    public static void main(String []args){
        
        Scanner input = new Scanner(System.in);
        
        int cases = input.nextInt();
        
        List<String> phones = new ArrayList<>();
        
        for(int i = 0; i < cases; i++){
            String phone = input.next();
            phones.add(phone);
        }
 
        int code = getCommonCode(phones);
        
        System.out.println(code);
     }
     
     public static int getCommonCode(List<String> phones){
                
        int codeCounter = 0;
        
        Set<Character> codes = new HashSet<>();

        int phoneLength = phones.get(0).length();
        
        for(int i =0; i < phoneLength; i++){
            
            for(String phone : phones){
                codes.add(phone.charAt(i));
            }
            
            // clear dublicates to check
            if(codes.size() == 1){
                codeCounter++;
            }
            else{
                // when matching different number
                break;
            }
            
            codes.clear();
        }
        
        return codeCounter;
     }
}