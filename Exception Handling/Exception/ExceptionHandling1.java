public class ExceptionHandling1 {
    public static void main(String[]args)
    {
        System.out.println("Helloo");
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("ArithmeticException has been handled");
        }
        catch(RuntimeException ae)
        {
            System.out.println("RuntimeException has been handled");
        }
        System.out.println("Byeeee");
    }
}
/*
Output:-
Helloo
ArithmeticException has been handled
Byeeee
 */
