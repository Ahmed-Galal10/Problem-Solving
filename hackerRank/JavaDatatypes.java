import java.util.Scanner;


class JavaDatatypes{
    public static void main(String []argh)
    {

        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();

        for(int i=0; i < cases; i++)
        {

            try
            {
                long x = input.nextLong();
                System.out.println(x + " can be fitted in:");
                
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE){
                    System.out.println("* byte\n* short\n* int\n* long");
                }
                else if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE){
                    System.out.println("* short\n* int\n* long");
                }
                else if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE){
                    System.out.println("* int\n* long");
                }
                else if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE){
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(input.next() + " can't be fitted anywhere.");
            }

        }
    }
}