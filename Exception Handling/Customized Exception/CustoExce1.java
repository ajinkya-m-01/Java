import java.util.Scanner;
class MyArithmeticException extends RuntimeException
{
    MyArithmeticException(String desc)
    {
        super(desc);
    }
}
class CustoExce1
{
    public static void main(String[] args) {
        int n1=10;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n2 : ");
        int n2=sc.nextInt();
        //int n2=0;
        if(n2==0)
        {
            throw new MyArithmeticException("Num can not divide by zero");
        }
        else{
            int op=n1/n2;
            System.out.println(op);
        }
    }
}
//! if input is 0 then : Exception in thread "main" MyArithmeticException: Num can not divide by zero