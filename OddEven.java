import java.util.Scanner;
class OddEven
{
public static void main(String[]oe)
{
//object of Scanner
System.out.println("Enter a number:");
Scanner ab=new Scanner(System.in);
int a=ab.nextInt();
String result=(a%2==0)?("Even"):("Odd");
System.out.println(result);
}
}

/* 
        1)Compile time: Success
        2)Run time: Success
        Output:
Enter a number:
27
Odd
            
        */