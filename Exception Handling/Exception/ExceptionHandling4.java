// public class ExceptionHandling4 
// {
//     public static void main(String[]args)
//     {
//         System.out.println("Helloo");
//         try{
//             String str = new String();
//             str.charAt(0);
//         }
//         catch(Exception e)
//         {
//             System.out.println("Exception has been handled");
//         }
//         catch(RuntimeException ae)
//         {
//             System.out.println("RuntimeException has been handled");
//         }
//         System.out.println("Byeeee");
//     }   
// }
// 
//  * Output:-
//  * Unreachable catch block for RuntimeException. 
//  * It is already handled by the catch block for Exception
//  
