import java.util.*;


public class InterestingDrink{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		list<Integer> prices = new ArrayList<>();
		//list<Integer> money = new ArrayList<>();
		
		for(int i = 0; i < n; i++){
			int x = input.nextInt();
			prices.add(x);
		}
		
		int q = input.nextInt();
		
		for(int i = 0; i < q; i++){
			int m = input.nextInt();
			int n = insertSorted(prices, n, key, capacity);
		}
		
		
		
		
		
	}
	
	
	 public static int nobleInteger(int arr[])
    {
        int size = arr.length;
        for (int i = 0; i < size; i++ )
        {
            int count = 0;
            for (int j = 0; j < size; j++)
                if (arr[i] < arr[j])
                    count++;
 
            // If count of greater elements
            // is equal to arr[i]
            if (count == arr[i])
                return arr[i];
        }
        return -1;
    }
	
}