import java.util.Scanner;
class CheckOddEvenRepeat
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int a=0;

		System.out.println("Enter the number:");
while(a==0){
		int n=sc.nextInt();


		if(n>=10&&n<=99)
{
a=1;
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
a=0;
System.out.println("Please Enter Two Digit Number");

}
}
}
}


/* 
        1)Compile time: Success
        2)Run time: Success
        Output:
Enter the number:
999
Please Enter Two Digit Number
22
The Number is Even
            
        */