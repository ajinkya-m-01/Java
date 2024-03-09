import java.util.Scanner;
class CheckprimeNum {
    public static void main(String[] args) {
        int c = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int a=sc.nextInt();
        //int a = 65; 
        int b = 2;

        while (b < a) {
            if (a % b == 0) {
                c++; 
            }
            b++;
        }
        
        if (c == 0) {
            System.out.println(a + " is a prime number");
        } else {
            System.out.println(a + " is not a prime number");
        }
    }
}
/*Run time:-Success
Compile time:-Success
O/P:-
Enter Number
17
17 is a prime number
*/
