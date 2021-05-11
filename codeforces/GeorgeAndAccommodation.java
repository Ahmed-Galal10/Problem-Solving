import java.util.Scanner;

public class GeorgeAndAccommodation{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int rooms = input.nextInt();
        
        int freeRooms = 0;
		
        for(int i = 0; i < rooms; i++){
            int peopleIn = input.nextInt();
            int capacity = input.nextInt();
						
            if(capacity - peopleIn >= 2){
                freeRooms++;
            }
        }
        
        System.out.println(freeRooms); 
    }
}