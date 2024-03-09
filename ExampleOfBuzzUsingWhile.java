import java.util.Scanner;

public class ExampleOfBuzzUsingWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char alphabet = 'A';
        
        System.out.println("Buzz Alphabets:");
        while (alphabet <= 'Z') {
            if ((alphabet % 5 == 0) || (alphabet % 7 == 0)) {
                System.out.print(alphabet + " ");
            }
            alphabet++;
        }
    }
}
/*Run time:-Success
Compile time:-Success
Buzz Alphabets:
A F K M P T U Z
*/