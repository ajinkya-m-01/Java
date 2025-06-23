public class FinallyEx3 {
    public static void main(String[]args)
    {
       System.out.println("Main Starts");
       m1();
       System.out.println("Main Ends");
    }
    public static void m1()
    {
        try{
            System.out.println("try");
            System.out.println(10/0);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("ArithmeticException Handled");
            return;
        }
        finally{
            System.out.println("Byee"); 
        }
    }
}
/*
Main Starts
try
ArithmeticException Handled
Byee
Main Ends
 */