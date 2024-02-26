import java.util.Scanner;
class IfElse
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(n>=10&&n<=99)
		{
			if(n%10==7||n%7==0)
			{
				System.out.println("Buzz Number");
			}
			else
			{
				System.out.println("Not Buzz Number");
			}
		}
	}
}

/* 
        1)Compile time: Success
        2)Run time: Success
        Output:
Enter the number:
27
Buzz Number
            
        */