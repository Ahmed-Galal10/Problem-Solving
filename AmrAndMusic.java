import java.util.*;
import java.util.stream.Collectors;


public class AmrAndMusic{

     public static void main(String []args){
        
        Scanner input = new Scanner(System.in);
        
        int instruments = input.nextInt();
        int days = input.nextInt();

        List<Integer> instDaysList = new ArrayList<>();

        for(int i=0; i < instruments; i++){
            
            int instDays = input.nextInt();
            instDaysList.add(instDays);
        }
        
        String learntInstruments = getlearntInstruments(instDaysList, days);
        
        System.out.println(learntInstruments);

     }
     
     public static String getlearntInstruments(List<Integer> instDaysList,int days){
         
        List<Integer> sortedinstDaysList = instDaysList.stream().collect(Collectors.toList());
        
        Collections.sort(sortedinstDaysList);
        
        int counterDays = 0;
        int learntInst = 0;
        String instPositions = "";
        
        for(Integer instDays : sortedinstDaysList){
            counterDays += instDays;

            if(counterDays > days){
                break;
            }
            
            instPositions += (instDaysList.indexOf(instDays) + 1) + " ";

            instDaysList.set(instDaysList.indexOf(instDays), -1);
            
            learntInst++;
        }
         
         return learntInst + "\n" + instPositions;
     }
     
}