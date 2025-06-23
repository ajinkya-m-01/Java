public class ExceptionHandling3 {
    public static void main(String[] args) {
        System.out.println("Helloo"); // Prints "Helloo"
        try {
            System.out.println(10 / 0); // Throws ArithmeticException (divide by zero)
            System.out.println("Helloo"); // This line will not be executed
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException has been handled"); // Catches and handles ArithmeticException
        } catch (Exception re) {
            System.out.println("Exception has been handled"); // This block won't be executed because ArithmeticException is already handled
        }
        System.out.println("Byeeee"); // Prints "Byeeee"
    }
}
/*
    Output :-
    Helloo
    ArithmeticException has been handled
    Byeeee
 */