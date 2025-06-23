// public class Switchclass
// {
//         public static void main(String[] args) {
//         int number = 2;
//         switch (number) {
//             case 1:
//                 System.out.println("Number is 1.");
//                 break;
//             case 2:
//                 System.out.println("Number is 2.");
//                 break;
//             case 3:
//                 System.out.println("Number is 3.");
//              break;
//         }
//     }
// }
import java.util.Scanner;;
class Switchclass
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int n1=sc.nextInt();

        //Scanner sc=new Scanner(System.in);
        System.out.println("Enter the second number : ");
        int n2=sc.nextInt();

        int largest=n1>n2?n1:n2;
        System.out.println("Largest number is : "+largest);
    }
}