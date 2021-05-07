import java.util.*;


public class SomeSums{

    public static void main(String []args){
        
        int sum = 0;
        
        Scanner input = new Scanner(System.in);
        
        int limitRange = input.nextInt();
        int minSum = input.nextInt();
        int maxSum = input.nextInt();
        
        int finalSum = claculateSum(limitRange, minSum, maxSum);
        System.out.println(finalSum);
    }
    
    public static int claculateSum(int limitRange, int minSum, int maxSum){
        
        int sum = 0;

        List<Integer> rangeList = new ArrayList<>();
        
        for(int num = minSum; num <= maxSum; num++){
            rangeList.add(num);
        }
        
        for(int num = 1; num <= limitRange; num++){
            int counter = 0;
            String charStore = "0";
            
            for(int digit = 0; digit < String.valueOf(num).length(); digit++){
            
                char ch = String.valueOf(num).charAt(digit);

                charStore += ch;
                counter += Integer.parseInt(charStore);
                
                charStore = "0";
            }
            
            if(rangeList.contains(counter)){
                sum += num;
            }
        }
        return sum;
    }
    
}