// import java.io.*;
// public class ExceptionHandling6 
// {
//     public static void main(String[]args)  
//     {
//         System.out.println("Helloo");
//         try
//         {
//             MyThread thread1=new MyThread();
//             thread1.start();
//             thread1.start();
//         }
//         catch(NullPointerException npe)  //!IllegalThreadStateException
//         {
//             System.out.println("Exception HAndled");
//             System.out.println("Byeee");
//         }
        
//     }  
// }class MyThread extends Thread{}

//!Output:-  Helloo
//!          Exception in thread "main" java.lang.IllegalThreadStateException