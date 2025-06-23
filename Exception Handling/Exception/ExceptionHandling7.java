//import java.io.*;
public class ExceptionHandling7
{
    public static void main(String[]args)  
    {
        System.out.println("Helloo");
        try
        {
            System.out.println(10/0);
        }
        catch(Throwable e)
        {
            System.out.println("Exception HAndled");
        }
        
        System.out.println("Byeee");
    }  
}

//! Output :-
//!  Helloo
//!  Exception HAndled
//!  Byeee