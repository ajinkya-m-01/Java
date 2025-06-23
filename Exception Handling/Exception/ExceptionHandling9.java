//import java.io.*;
public class ExceptionHandling9
{
    public static void main(String[]args)  
    {
        System.out.println("Helloo");
        try
        {
            System.out.println("try block");
            System.out.println(10/0);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Exception Handled from catch");
            String str=new String();
            str.charAt(0);
        }
        catch(NullPointerException npe)
        {
            System.out.println("Exception Handled ");
        }
        System.out.println("Byeee");
    }  
}
//! Output :-
//! Helloo
//! try block
//! Exception Handled from catch
//! Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 0 out of bounds for length 0