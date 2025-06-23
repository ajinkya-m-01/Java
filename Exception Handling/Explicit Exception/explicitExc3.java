public class explicitExc3
{
    public static void main(String[] args) {
        System.out.println("HEllo");
        throw new ArithmeticException("You can not divide any number by zero");
       // System.out.println("Byeeee");   //!After throw exception not executing another printing statements
    }
}
/*
HEllo
Exception in thread "main" java.lang.ArithmeticException: You can not divide any number by zero
 */
