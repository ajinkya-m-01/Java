
import java.util.Scanner;
public class ExampleOddEvenDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        int odd=0;
        int even=0;
        //int a=654321;
        int r;
        do
        {
            r=a%10;
            if(r%2==0){
                even++;
            }
            else{
                odd++;
            }
            a=a/10;
        }
        while(a>0);
        System.out.println("Odd Digits:" +odd+ "\nEven Digits:"+even);
    }
}
 /*
 * Run Time=Success
 * Compile Time=Success
 * Output:
Enter a number:
987654321
Odd Digits:5
Even Digits:4
 */