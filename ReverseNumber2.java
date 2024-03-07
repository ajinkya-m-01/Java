import java.util.Scanner;
public class ReverseNumber2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        //int a=3456;
        int b=0;
        int r;
        int x=a;
        do{
            r=a%10;
            b=b*10+r;
            a/=10;
        }
        while(a>0);
        System.out.println("Reverse number of " +x+ " is "+b);
    }
    
}
 /*
 * Run Time=Success
 * Compile Time=Success
 * Output:
Enter a number:
123456789
Reverse number of 123456789 is 987654321
 */