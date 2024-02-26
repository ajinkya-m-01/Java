import java.util.Scanner;
class CheckOddEven
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(n>=10&&n<=99)
{
if(n%2==0)
{
System.out.println("The Number is Even");
}
else
{
System.out.println("The Number is Odd");
}
}
else
{
System.out.println("Please Enter Two Digit Number");
}
}
}
/* 
        1)Compile time: Success
        2)Run time: Success
        Output:
            
        */