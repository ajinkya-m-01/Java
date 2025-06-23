public class ExceptionHandling10
{
    public static void main(String[]args)  
    {
        System.out.println("Helloo");
        System.out.println(10/0);
        try
        {
            System.out.println(10/0);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Exception Handled");
        }    
        System.out.println("Byeee");
    }  
}