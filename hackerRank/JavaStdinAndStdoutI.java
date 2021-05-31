import java.util.*;

public class JavaStdinAndStdoutI {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println(a +"\n" + b + "\n" + c);
    }
}
