public class FinallyEx2 {
    public static void main(String[]args)
    {
        try{
            System.out.println("DB connection Open");
            System.out.println("Hello");
            System.out.println(10/0);
        }
        catch(ArithmeticException AE)
        {
            System.out.println("ArithmeticException Handled");
        }
        finally
        {
            System.out.println("DB connection closed");
        }
    }
}
/*
DB connection Open
Hello
ArithmeticException Handled
DB connection closed   
 */