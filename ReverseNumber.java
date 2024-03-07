import java.util.Scanner;
public class ReverseNumber
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        
        int r;
        do
        {
            r=a%10;
            System.out.print(r);   
            a=a/10;         
        }
        while(a>0);
    }
}
/*
 * Run Time=Success
 * Compile Time=Success
 * Output:
 * Enter a number:
123456789
987654321
 */