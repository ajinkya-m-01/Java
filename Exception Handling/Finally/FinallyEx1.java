public class FinallyEx1 {
    public static void main(String[]args)
    {
        try{
            System.out.println("DB connection Open");
            System.out.println("Hello");
            System.out.println(10/0);
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
DB connection closed
Exception in thread "main" java.lang.ArithmeticException: / by zero
 */