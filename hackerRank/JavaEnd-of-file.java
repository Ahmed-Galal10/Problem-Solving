import java.util.Scanner;

public class JavaEnd-of-file {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        for(int i = 1; input.hasNext(); i++){
            System.out.println(i + " " + input.nextLine());
        }
        input.close();
    }
}